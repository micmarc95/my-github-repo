package pl.com.marcinkowski.java14.anonymous_classes.my_anonymous;

public class MainPlant {

    public static void main(String[] args) {

        Gardener gardener = new Gardener();

        /////////////////////////////////////////////////

        Plant plant1  = new Flower();

        Plant plant2 = new Plant() {
            @Override
            public void grow() {
                System.out.println("grow");
            }

            @Override
            public void smell() {
                System.out.println("smell");
            }

            @Override
            public void wilt() {
                System.out.println("wilt");
            }
        };

        //plant 3 nie jest tworzone bo bez referencji będzie procesowane "jednorazowo"

        ///////////////////////////////////////////////////

        gardener.processPlant(plant1);                 //procesowanie plant1 czyli najprościej z klasy Flower
        gardener.processPlant(plant2);                 //procesowanie plant2 czyli klasy anonimowej
        gardener.processPlant(new Plant() {            //procesowanie tworzonej w tym samym miejscu rośliny
            @Override
            public void grow() {
                System.out.println("grow");
            }

            @Override
            public void smell() {
                System.out.println("smell");
            }

            @Override
            public void wilt() {
                System.out.println("wilt");
            }
        });
    }






}
