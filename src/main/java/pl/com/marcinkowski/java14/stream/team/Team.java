package pl.com.marcinkowski.java14.stream.team;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Player> players = new ArrayList<>();
    private Coach coach;

    public Team(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addNewPlayer(Player player){
        players.add(player);
    }
}
