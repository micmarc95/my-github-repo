package pl.com.marcinkowski.java14.inner_class;

public class HouseTest {
    public static void main(String[] args) {

        House myHouse = new House("Rezydencja Michałą");

        House betterHouse1 = new House();
        betterHouse1.setHouseName("Java home");
        House.Apartment myNewApartment = betterHouse1.new Apartment(80);
        myNewApartment.printNameOfHouse();
        House.Apartment mySecondApartment = betterHouse1.new Apartment(30);
        mySecondApartment.printNameOfHouse();

        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home");
        House.Apartment friendApartment = betterHouse2.new Apartment(50);
        friendApartment.printNameOfHouse();




    }
}
