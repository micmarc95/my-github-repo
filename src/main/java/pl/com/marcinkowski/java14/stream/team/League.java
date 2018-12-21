package pl.com.marcinkowski.java14.stream.team;

import java.util.ArrayList;
import java.util.List;

public class League {
    private String leagueName;
    private List<Team> teamList = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public void registerTeam(Team team){
        teamList.add(team);
    }
}
