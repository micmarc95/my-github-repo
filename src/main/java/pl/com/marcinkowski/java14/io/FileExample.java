package pl.com.marcinkowski.java14.io;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        File maybeFile = new File("C:\\Users\\Michał\\Desktop\\Kurs JAVA\\Jet-Pack-Book");
        System.out.println(maybeFile.exists());
        System.out.println(maybeFile.isDirectory());

        File existingOneOrNot = new File("afsdgadgad\\gadgag\\gadg");
        System.out.println(existingOneOrNot);

        try {Reader reader =  new FileReader("C:\\Users\\Michał\\Desktop\\Kurs JAVA\\Jet-Pack-Book");
            int readChar;
            while((readChar = reader.read()) !=-1){
            System.out.println(readChar);
        }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
