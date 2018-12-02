package pl.com.marcinkowski.java14.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    // List<Integer>
    // 1000 elements - 1:100
    // 51 - print index of 51
    // use break

    static List<Integer> NumberList = new ArrayList<>();


    public static void main(String[] args) {

        DoNumbers();
    }

    public static void DoNumbers() {

        List<Integer> NumberList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            NumberList.add(random.nextInt(101));
        }

        int indexOf51 = -1;
        for (int i=0; i < NumberList.size(); i++){
            if (NumberList.get(i) == 51){
                indexOf51 = i;
                break;
            }
        }
        System.out.println("Index of 51 number: " + indexOf51);

        String s = null;
        int a = 5;
        Integer aa = Integer.valueOf(5); // to wywołuje boxing jak w przypadku typów prostych

        int b = aa;
        aa.intValue(); // to wywołuje unboxing jak w przypadku typów prostych


        Integer aI = 5;
    }
}
