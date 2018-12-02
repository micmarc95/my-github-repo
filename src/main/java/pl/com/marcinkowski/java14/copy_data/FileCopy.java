package pl.com.marcinkowski.java14.copy_data;

import java.io.*;


public class FileCopy {

    public static void main(String[] args) throws IOException{

        File plik = new File("C:\\Users\\Michał\\Desktop\\text.txt");
        File plik2 = new File("C:\\Users\\Michał\\Desktop\\text2.txt");

        FileInputStream FileRead = new FileInputStream(plik);
        FileOutputStream FileWrite = new FileOutputStream(plik2);

        int c;
        while ((c = FileRead.read())!=-1)
            FileWrite.write((char)FileRead.read());

        FileRead.close();
        FileWrite.close();
    }

}