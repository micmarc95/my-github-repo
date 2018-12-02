package pl.com.marcinkowski.java14.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionsTest {
    public static void main(String[] args) {
        // 2 lists
        // add 500 elements to each list
        //first for more searching
        //second for more adding

        List<Integer> firstList = new ArrayList<>(); // for search
        List<Integer> secondList = new LinkedList<>(); // for adding
        Random random = new Random(100);

        for (int i = 0; i < 500; i++){
            firstList.add(random.nextInt(500));
            secondList.add(random.nextInt(500));
        }

        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println('\n');

        // pętla do przelecenia przez listy od końca
        for (int i = firstList.size() - 1; i > -1; i--){
            System.out.println("firstList (ArrayList) for searching [" + i + "]: " + firstList.get(i));
            System.out.println("secondList (LinkedList) for adding [" + i + "]: " + secondList.get(i));
        }




    }
}
