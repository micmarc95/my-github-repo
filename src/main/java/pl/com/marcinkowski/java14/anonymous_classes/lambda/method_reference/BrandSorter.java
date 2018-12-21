package pl.com.marcinkowski.java14.anonymous_classes.lambda.method_reference;

public class BrandSorter {
    // < 0
    // = 0
    // > 0
    static int brandOrder (String brand1, String brand2){
        return brand1.compareTo(brand2);
    }
}
