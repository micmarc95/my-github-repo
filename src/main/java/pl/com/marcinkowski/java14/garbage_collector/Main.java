package pl.com.marcinkowski.java14.garbage_collector;

public class Main {

    public static void main(String[] args) {
        Object o = makeObject();
        {
            Object a = new Object();
        }
        System.gc();
        empty();

    }

    public static Object makeObject(){
        String temporal = new String("Lost one");
        empty();
        return new String("new String");
    }

    public static void empty(){
        //empty
    }
}
