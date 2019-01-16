package pl.com.marcinkowski.java14.exercise;

import java.lang.reflect.Array;

public class ArrayExercise {

    public static void main(String[] args) {

        int [] array = {1, 2, 3};
        System.out.println(array.toString());
        System.out.println(Integer.toHexString(array.hashCode()));

        Integer[] arrayOfIntegers = {1, 2, 3};
        Object[] objects = arrayOfIntegers;

        System.out.println(objects.length);

        Object o = array;

        Anonymous anonymous = new Anonymous();
        System.out.println(anonymous.toString());

    }

}

        class Anonymous {

        }
