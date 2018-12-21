package pl.com.marcinkowski.java14.casting;


public class Main {
    public static void main(String[] args) {
        Object object = new String ("string");
//        object.substring() - nie może działać
        String string = (String) object;
        string.substring(1);
//      Number number = (Number) object;
        takeOject(Integer.valueOf(1));
    }

    public static void takeOject (Object object){

        if (object instanceof String) {
            String s = (String) object;
        }
    }
}
