package pl.com.marcinkowski.java14.solid.liskov_substitution;

public class Main {
    public static void main(String[] args) {

        final String samsung = "Samsung";
        FeaturePhone featurePhone = new FeaturePhone(samsung);
        Smartphone smartphone = new Smartphone(samsung);

        System.out.println("featurephone ?= smartphone: " + featurePhone.equals(smartphone));
        System.out.println("smartphone ?= featurephone: " + smartphone.equals(featurePhone));
    }
}
