package pl.com.marcinkowski.java14.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainCloth {
    public static void main(String[] args) {
        List<Cloth> clothes = new ArrayList<>(Arrays.asList(
                new Cloth(true, 43),
                new Cloth(false, 43),
                new Cloth(false, 36),
                new Cloth(false, 47),
                new Cloth(true, 26)
        ));
        ///////////////////////////////////////
        Comparator<Cloth> myComparator = Comparator.comparing(Cloth::getSize).thenComparing(cloth -> !cloth.isCleanOrDirty()); // z negacją sortują najpierw po true, normalnie sortuje najpierw false
        clothes.sort(myComparator);
        System.out.println(clothes);

        clothes.sort(Comparator.comparing(Cloth::getSize).thenComparing(Cloth::isCleanOrDirty));;
        System.out.println(clothes);
        ///////////////////////////////////////


    }
}
