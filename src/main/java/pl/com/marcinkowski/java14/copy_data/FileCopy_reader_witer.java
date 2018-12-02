package pl.com.marcinkowski.java14.copy_data;

import java.io.*;

public class FileCopy_reader_witer {
    public static void main(String[] args){
        transferData();
    }

    public static void transferData(){
        Reader reader = null;
        Writer writer = null;

        try {
            File plik = new File("C:\\Users\\Michał\\Desktop\\text.txt");
            File plik2 = new File("C:\\Users\\Michał\\Desktop\\text2.txt");

            reader = new FileReader(plik);
            writer = new FileWriter(plik2);

            int data = reader.read();

            while (data != -1) {
                writer.write(data);
                data = reader.read();
            }
            writer.flush();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (null!=writer){
                try {writer.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }

            }if (null != reader){
                try {reader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
