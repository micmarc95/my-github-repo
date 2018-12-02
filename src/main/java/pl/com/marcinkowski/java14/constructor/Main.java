package pl.com.marcinkowski.java14.constructor;

public class Main {
    public static void main(String[] args) {

        //Dish myLunch = new Dish();
        //Dish secondLunch = new Dish();
        System.out.println("/////////////////////////////");
        Pizza hawajska = new Pizza();
        Cutlet cutlet = Cutlet.giveMeNowNormalCutlet();
        Cutlet cutlet1 = Cutlet.giveMeCutletWithOnion();
        Cutlet cutlet2 = Cutlet.giveMeCutletWithOnionThatIsGrilled();
    }
}
