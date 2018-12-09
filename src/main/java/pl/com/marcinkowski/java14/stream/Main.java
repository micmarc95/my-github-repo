package pl.com.marcinkowski.java14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Country> countries = Arrays.asList(
                new Country(40_000_000,"Poland",312,5000),
                new Country(75_000_000,"France",412,2000),
                new Country(120_000_000,"Russia",2312,1100),
                new Country(65_000_000,"England",322,3000),
                new Country(72_000_000,"Germany",352,8000)
        );

        List<Country> result = genericFilter(countries,country -> country.getAverageSalary() >= 3000);
        result.forEach(country -> System.out.println(country));
        System.out.println();
        List<Country> result1 =genericFilter(countries,country -> country.getNumberOFPeople() > 50_000_000);
        result1.forEach(country -> System.out.println(country));

    }

    private static List<Country> getListOfRichCountires(List<Country> countries, double minimalPayCheck){
        List<Country> result = new ArrayList<>();
        for (Country country : countries)
        {
            if (country.getAverageSalary() >= minimalPayCheck){
                result.add(country);
            }
        }

        return result;
    }

    private static List<Country> getListWithALotOfPeople (List<Country> countries, long minimalNumberOfPeople){
        List<Country> result = new ArrayList<>();
        for (Country country : countries)
        {
            if (country.getNumberOFPeople() >= minimalNumberOfPeople){
                result.add(country);
            }
        }
        return result;
    }

    private static List<Country> filterByMinimalPeopleNumber (List<Country> countries, long minimalPeopleNumber){

        return countries.stream()
                .filter(country -> country.getNumberOFPeople() > minimalPeopleNumber)
                .collect(Collectors.toList());

    }

    private static List<Country> genericFilter (List<Country> countries, Predicate<Country> predicate){

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }

}
