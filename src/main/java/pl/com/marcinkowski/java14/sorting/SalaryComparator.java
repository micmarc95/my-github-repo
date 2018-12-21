package pl.com.marcinkowski.java14.sorting;

import java.util.Comparator;

public class SalaryComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getIncome() - o2.getIncome());
    }
}
