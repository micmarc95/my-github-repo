package pl.com.marcinkowski.java14.generic;

import pl.com.marcinkowski.java14.equals_and_hashcode.Person;

public class HolderTest {
    public static void main(String[] args) {

        ObjectHolder holder = new ObjectHolder();
        holder.setSecret(new Person("m","n",5));

//        proccessHolder(holder);

        ///////////////////////////////////////////////////////////////////////////////////

        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setSecret("sekret");
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHolder = new GenericHolder<>();
        personHolder.setSecret(new Person("Michał", "Marcinkowski",30));
        System.out.println(personHolder.getSecret());
    }

    public static void proccessHolder (ObjectHolder holder){
        String secret = (String) holder.getSecret();
    }
}
