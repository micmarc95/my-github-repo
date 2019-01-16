package pl.com.marcinkowski.java14.garbage_collector;

import java.util.HashSet;
import java.util.Set;

public class FeaturePhoneExample {

    public static void main(String[] args) {

        Set<FeaturePhone> phones = new HashSet<>();
        FeaturePhone nokia1 = new FeaturePhone("nokia 3310");
        FeaturePhone nokia2 = new FeaturePhone("nokia 3310");

        System.out.println("nokia1 =? nokia2: " + (nokia1.equals(nokia2)));

        phones.add(nokia1);
        phones.add(nokia2);

        while (true){
            phones.add(new FeaturePhone("Nokia 3310"));
        }

        //System.out.println(phones);
    }
}
