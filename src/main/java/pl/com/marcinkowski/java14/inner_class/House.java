package pl.com.marcinkowski.java14.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String houseName;
    private List<Apartment> apartments;

    ///////////////////////////////////////////////////

    public House() {
        apartments = new ArrayList<>();
    }

    public House(String houseName){

        this.houseName = houseName;
        apartments = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            apartments.add(new Apartment(30));
        }
    }

    ///////////////////////////////////////////////////

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void addApartment (Apartment apartment){
        apartments.add(apartment);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public class Apartment{              //to jest różnica między static w klasie jak w przypadku vehicle, ktora jest static ---> Analogia: koło moze istnieć bez samochodu, ale mieszkanie bez bloku już nie

        int sizeInSquareM;

        public Apartment(int sizeInSquareM) {
            this.sizeInSquareM = sizeInSquareM;
        }

        @Override
        public String toString() {
            return "Apartment{" +
                    "sizeInSquareM=" + sizeInSquareM +
                    '}';
        }
        /////////////////////////////////////////////////////

        public void printNameOfHouse(){
            System.out.println("House name: " + House.this.houseName);
        }
    }
}
