package pl.com.marcinkowski.java14.null_avoid.football;


import java.util.Optional;

//FootballClub -> Stadion -> Chairs ->Number
public class Main {
    public static void main(String[] args) {
        Numberr number = new Numberr(19);
        Chair chair = new Chair(number);
        Stadion stadion = new Stadion(chair);
        FootballClub footballClub = new FootballClub(stadion);
        FootballClub footballClub1 = new FootballClub(null);


        getChairNumber(footballClub);

    }

    private static void getChairNumber(FootballClub footballClub){

        Optional.ofNullable(footballClub)
                .map(FootballClub::getStadion)
                .map(Stadion::getChair)
                .map(Chair::getNumberr)
                .map(Numberr::getNumber)
                .ifPresent(number -> System.out.println("Chair number: " + number));
    }

}
