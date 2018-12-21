package pl.com.marcinkowski.java14.null_avoid.football_with_optional;

public class FootballClub {

    private Stadion stadion;

    public FootballClub(Stadion stadion) {

        this.stadion = validate(stadion);
    }

    public Stadion getStadion() {

        return stadion;
    }

    public void setStadion(Stadion stadion) {

        this.stadion = validate(stadion);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadion=" + stadion +
                '}';
    }

    private Stadion validate (Stadion stadion){
        if (stadion == null){
            throw new IllegalArgumentException("Stadion cannot be null");
        }
        return stadion;
    }
}
