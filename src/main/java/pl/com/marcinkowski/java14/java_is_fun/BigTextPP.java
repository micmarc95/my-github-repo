package pl.com.marcinkowski.java14.java_is_fun;

import java.util.*;


public class BigTextPP {

    public static  char TARGET = '*';
    public static final Map<Character, byte[][]> MAP_CHAR;
    static {


        /* tutaj można dodać cały alfabet, mi niechciało się - są tylko niezbędne znaki...*/
        MAP_CHAR = new HashMap();
        MAP_CHAR.put('A', new byte[][]{
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1}
        });
        MAP_CHAR.put('J', new byte[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0}});
        MAP_CHAR.put('V', new byte[][]{
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}});
        MAP_CHAR.put('i', new byte[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}});
        MAP_CHAR.put('s', new byte[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 0}});
        MAP_CHAR.put('f', new byte[][]{
                {0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}});
        MAP_CHAR.put('u', new byte[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 0}});
        MAP_CHAR.put(' ', new byte[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}});
        MAP_CHAR.put('n', new byte[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1}
        });
        MAP_CHAR.put('?', new byte[][]{
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}

        });
        MAP_CHAR.put('!', new byte[][]{
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0}
        });

    }


    public  byte[][] translateCharacterToMatrix(char c) {
        byte[][] buf = MAP_CHAR.get(c);
        return buf == null ? MAP_CHAR.get('?') : buf;
    }

    public  List<byte[][]> goText(String text) {
        List<byte[][]> list = new ArrayList<>();
        for (char c : text.toCharArray()) {
            list.add(translateCharacterToMatrix(c));
        }
        return list;
    }

    public  void printHorizontally(String text) {
        List<byte[][]> list = goText(text);
        for (int i = 0; i < 7; i++) {
            for (byte[][] l : list) {
                printLineOfCharacter(l[i]);
                System.out.print("  ");
            }
            System.out.printf("\n");
        }
    }

    public  void printLineOfCharacter(byte[] arrayLine) {
        for (int j = 0; j < arrayLine.length; j++) {
            System.out.print(arrayLine[j] == 1 ? TARGET : " ");
        }

    }

    public  void printVertically(String text) {
        List<byte[][]> list = goText(text);
        for (byte[][] l : list) {
            for (int i = 0; i < 7; i++) {
                printLineOfCharacter(l[i]);
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {

        String text = "JAVA is fun!";
        BigTextPP bigTextPP = new BigTextPP();
        bigTextPP.printHorizontally(text);
        System.out.println("\n\n\n\n");
        bigTextPP.printVertically(text);
    }
}

