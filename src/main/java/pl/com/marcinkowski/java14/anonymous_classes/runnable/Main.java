package pl.com.marcinkowski.java14.anonymous_classes.runnable;

 class Run implements Runnable{

     @Override
     public void run() {
         System.out.println("run");
         System.out.println("via class that implements Runnable");
         System.out.println();
     }
 }

public class Main {
    public static void main(String[] args) {
        // 1 - zwykła klasa implementująca Runnable

        Run running = new Run();
        running.run();

        //  2 - klasa anonimowa - z zachowaniem referencji

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable anonymous class with reference");
            }
        };
        runnable.run();

        //  3 - klasa anonimowa - przekazana jako parametr

        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run anonymous class passed as a parameter");
            }
        });

        //  4 - lambda z zachowaniem referencji

        Runnable runnable1 = () -> System.out.println("Run in lambda with reference");
        runnable1.run();

        //  5 - lambda

        processRunnable(() -> System.out.println("run in lambda"));

    }

    public static void processRunnable (Runnable runnable){
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();
    }
}




