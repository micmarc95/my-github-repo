package pl.com.marcinkowski.java14.exception.network;

import java.util.Random;

public class StockExchange {
    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();
        String readData = null;

        try {stockExchange.readData();
            System.out.println("after");}
        catch (ReadDataException exc)
        {readData = "";}
        finally {
            System.out.println(readData);
        }
    }

    //constructor StockExchangeCreationException
    //ReadDataException
    //Random - % 2


    public String readData () throws ReadDataException {
        Random random = new Random();
        int i = random.nextInt(101);

        if (i % 2 == 1){
            throw new ReadDataException("Data reading error");
        }
            return "data";
    }

    public  StockExchange() throws  StockExchangeCreationException{
        Random random = new Random();
        int i = random.nextInt(101);
        if (i % 2 == 1){
            throw new StockExchangeCreationException("Network connection error");
        }


    }
}
