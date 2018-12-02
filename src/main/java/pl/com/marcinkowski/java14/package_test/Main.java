package pl.com.marcinkowski.java14.package_test;



public class Main {
    public static void main(String[] args) {

        pl.com.marcinkowski.java14.package_test.one.Speaker speaker1 = new pl.com.marcinkowski.java14.package_test.one.Speaker();
        pl.com.marcinkowski.java14.package_test.two.Speaker speaker2 = new pl.com.marcinkowski.java14.package_test.two.Speaker();
        pl.com.marcinkowski.java14.package_test.three.Speaker speaker3 = new pl.com.marcinkowski.java14.package_test.three.Speaker();

        speaker1.speak();
        speaker2.speak();
        speaker3.speak();
    }
}
