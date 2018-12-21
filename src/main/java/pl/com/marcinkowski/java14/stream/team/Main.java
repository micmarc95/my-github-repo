package pl.com.marcinkowski.java14.stream.team;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Player first = new Player("first",80, BigDecimal.valueOf(10_000));
        Player second = new Player("second",87, BigDecimal.valueOf(20_000));
        Player messi = new Player("messi",99, BigDecimal.valueOf(30_000));
        Player ronaldo = new Player("ronaldo",98, BigDecimal.valueOf(40_000));
        Player fifth = new Player("fifth",77, BigDecimal.valueOf(50_000));

        Coach smuda = new Coach("Franek", "Smuda",BigDecimal.valueOf(100_000));
        Coach mourinho = new Coach("Jose", "Mourinho",BigDecimal.valueOf(200_000));
        Coach alvaro = new Coach("Fabio", "Alvaro",BigDecimal.valueOf(200_000));
        Coach zidane = new Coach("Zinedine", "Zidane",BigDecimal.valueOf(200_000));
        Coach nawalka = new Coach("Adam", "Nawałka",BigDecimal.valueOf(200_000));

        Team allStars = new Team(smuda);
        allStars.setPlayers(Arrays.asList(messi,ronaldo));
        Team krepianka = new Team(mourinho);
        krepianka.setPlayers(Arrays.asList(first,second,fifth));
        Team alvaroTeam = new Team(alvaro);
        Team zidaneTeam = new Team(zidane);
        Team nawalkaTeam = new Team(nawalka);


        List<Coach> treneiros = new ArrayList<>();
        treneiros.add(smuda);
        treneiros.add(mourinho);
        treneiros.add(alvaro);
        treneiros.add(zidane);
        treneiros.add(nawalka);



        League japanLeague = new League("Japan League");
        japanLeague.registerTeam(allStars);
        japanLeague.registerTeam(krepianka);


        System.out.println(getFilteredPlayers (japanLeague,player -> player.getSkill() > 90));
        System.out.println(getFilteredPlayers (japanLeague,player -> player.getNick().startsWith("r")));
        System.out.println(getFilteredCoach(treneiros));

    }
    private static List<Player> getAllLeaguePlayersDumb (League league){
        List<Player> result = new ArrayList<>();

        for (Team team : league.getTeamList()){
            result.addAll(team.getPlayers());
        }
        return result;
    }

    private List<Player> getAllLeaguePlayers (League league){

        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .collect(Collectors.toList());

    }

    private static List<Player> getFilteredPlayers (League league, Predicate<Player> predicate){

        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(predicate)
                .collect(Collectors.toList());

    }

    private static Optional<Coach> getFilteredCoach (List<Coach> treneiros ){
            return treneiros.stream()
                .filter(coach -> coach.getName().length() == 4)
                .findFirst();
    }

    private static List<Player> players = new ArrayList<>();
    private static void getCoaches (League league){
                league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .forEach(player -> players.add(player));
    }

}
