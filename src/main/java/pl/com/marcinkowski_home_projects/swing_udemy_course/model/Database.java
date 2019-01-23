package pl.com.marcinkowski_home_projects.swing_udemy_course.model;

import java.io.*;
import java.util.*;

public class Database {

    private LinkedList<Person> people;

    public Database() {
        people = new LinkedList<>();
    }

    public void removePerson(int index){
        people.remove(index);
    }

    public void addPerson (Person person){
        people.add(person);
    }

    public List<Person> getPeople(){
        return Collections.unmodifiableList(people);
    }

    public void saveToFile (File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream ous = new ObjectOutputStream(fos);

        Person[] persons = people.toArray(new Person[people.size()]);
        ous.writeObject(persons);

        ous.close();
    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Person[] persons = (Person[]) ois.readObject();
            people.clear();
            people.addAll(Arrays.asList(persons));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ois.close();
    }
}
