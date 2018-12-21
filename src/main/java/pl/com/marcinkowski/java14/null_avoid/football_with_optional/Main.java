package pl.com.marcinkowski.java14.null_avoid.football_with_optional;


import java.util.Optional;

//FootballClub -> Stadion  nie jest nullem -> Chairs ->Number nie jest nullem
public class Main {
    public static void main(String[] args) {

        Numberr number = new Numberr(5);
        Chair chair = new Chair(number);
        Stadion stadion = new Stadion(chair);
        FootballClub footballClub = new FootballClub(stadion);
       //FootballClub footballClub1 = new FootballClub(null); - nie można nawet stworzyć z nullem bo rzuci wyjątkiem

        printChairNumber(footballClub);

    }

    private static void printChairNumber(FootballClub footballClub){

        Optional.ofNullable(footballClub)
                .map(footballClub2 -> footballClub2.getStadion())
                .flatMap(stadion -> stadion.getChair())
                .map(chair -> chair.getNumberr())
                .map(numberr -> numberr.getNumber())
                .ifPresent(number -> System.out.println("Chair number: " + number));
    }

}
