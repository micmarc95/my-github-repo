package pl.com.marcinkowski.java14.exception;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = null;
        Person person2 = null;
//        Person2 person3 = null;

        try {person1 = new Person("Michał","Marcinkowski",23);
             person2 = new Person("Radek","",24);
        } catch (WrongParameter wrongParameter){
            wrongParameter.printStackTrace();
        }

        Person2 person3 = new Person2(null,"",-3);

//        try {person3 = new Person2("Marcin","",-3);}
//        catch (IllegalArgumentException illegalArgument){
//            illegalArgument.printStackTrace();
//        }
    }
}
