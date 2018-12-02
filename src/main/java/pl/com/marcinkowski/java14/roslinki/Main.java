package pl.com.marcinkowski.java14.roslinki;

import pl.com.marcinkowski.java14.enum_example.Week;

public class Main {

    public static void main(String[] args) {

        Gardener gardener = new Gardener();

        /*Plant cactus = new Cactus(100,20,20);
        Plant cactus2 = new Cactus(150,25,25);

        Plant opuncja = new Opuncja(50,10,10);
        Plant opuncja2 = new Opuncja(70,30,30);

        for (int i=0; i<7 ; i++) {

            gardener.waterPlant(cactus);
            gardener.waterPlant(cactus2);
            gardener.waterPlant(opuncja);
            gardener.waterPlant(opuncja2);
            gardener.waterPlant(rose);
            gardener.waterPlant(rose2);

            gardener.makePlantGrow(cactus);
            gardener.makePlantGrow(cactus2);
            gardener.makePlantGrow(opuncja);
            gardener.makePlantGrow(opuncja2);
        Plant rose = new Rose (30,20,20);
        Plant rose2 = new Rose (40,25,25);

            gardener.makePlantGrow(rose);
            gardener.makePlantGrow(rose2);
        }

        System.out.println("cactus 1 - " + cactus + '\n');
        System.out.println("cactus 2 - " + cactus2 + '\n');
        System.out.println("opuncja 1 - " + opuncja + '\n');
        System.out.println("opuncja 2 - " + opuncja2 + '\n');
        System.out.println("rose 1 - " + rose + '\n');
        System.out.println("rose 2 - " + rose2 + '\n');*/

        Plant[] kwiatki = makePlants();

        for (Week weekDay : Week.values()){
            System.out.println("Day of the Week: " + weekDay);

            for (Plant roslina : kwiatki){
                gardener.waterPlant(roslina);
                gardener.makePlantGrow(roslina);
            }
        }

        for (Plant roslina : kwiatki){
            System.out.println(roslina);;
        }


    }

    public static Plant[] makePlants(){

        Plant[] kwiatki = new Plant[6];

        kwiatki[0] = new Cactus(100,20,20);
        kwiatki[1] = new Cactus(150,25,25);
        kwiatki[2] = new Opuncja(50,10,10);
        kwiatki[3] = new Opuncja(70,30,30);
        kwiatki[4] = new Rose (30,20,20);
        kwiatki[5] = new Rose (40,25,25);

        return  kwiatki;
    }
}
