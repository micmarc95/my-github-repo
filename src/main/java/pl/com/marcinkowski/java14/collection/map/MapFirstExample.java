package pl.com.marcinkowski.java14.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {
    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>(); // Map < typ klucza, typ wartości> ref = new HashMap<>();
        System.out.println(idsOverNames.put("95021305430" , "Michał"));
        System.out.println(idsOverNames.put("95021305431" , "Radek"));
        System.out.println(idsOverNames.put("95021305432" , "Andrzej"));
        System.out.println(idsOverNames.put("95021305433" , "Roman"));
        System.out.println(idsOverNames.put("95021305434" , "Wojtek"));

        for(String key : idsOverNames.keySet()) {
            System.out.println("Key: " + key + " value: " + idsOverNames.get(key));
        }

        Map<String, String> secondMap = new LinkedHashMap<>();



    }
}
