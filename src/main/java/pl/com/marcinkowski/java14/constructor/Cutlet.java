package pl.com.marcinkowski.java14.constructor;

public class Cutlet {

    private Cutlet(){
        System.out.println("Cutlet");
    }
    private Cutlet(String cutletKind){
        System.out.println("Cutlet" + cutletKind);
    }
    private Cutlet(String cutletKind, String onionKind){
        System.out.println("Cutlet" + cutletKind + " " + onionKind);
    }

    public static Cutlet giveMeNowNormalCutlet() {
        return new Cutlet();
    }

    public static Cutlet giveMeCutletWithOnion() {
        return new Cutlet(" z cebulką");
    }
    public static Cutlet giveMeCutletWithOnionThatIsGrilled() {
        return new Cutlet(" z cebulką","grilowaną");
    }
}
