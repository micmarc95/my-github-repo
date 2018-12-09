package pl.com.marcinkowski.java14.anonymous_classes.runnable;

public class FabricExample {


    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        MyRunnable myRunnable1 = new MyRunnable();
        myRunnable1.run();
        makeNewRunnable();
        makeNewRunnable();
        makeNewRunnableWithLambda();
    }

    private static Runnable makeNewRunnable() {

        return new Runnable() {
            private String name = "Michał";

            @Override
            public void run() {
                String name = "Piotrek";
                System.out.println("my name: " + this.name);
            }
        };
    }

    private static Runnable makeNewRunnableWithLambda() {

        return () -> {
            String name = "Michał";
            System.out.println("my name: " + name);
        };

    }
}

class MyRunnable implements Runnable {
    private String name = "Michał";

    @Override
    public void run() {
        System.out.println("my name: " + this.name);
    }
}
