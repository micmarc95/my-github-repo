package pl.com.marcinkowski.java14.anonymous_classes;

public class MainMoveable {

    public static void main(String[] args) {

        Moveable moveable1 = new Moveable() {
            @Override
            public void run() {
                System.out.println("run");
            }

            @Override
            public void fly() {
                System.out.println("fly");
            }
        };

        MoveableProcessor processor = new MoveableProcessor();
        processor.processMoveable(moveable1);

        ///////////////////////////////////////////////////////////////////////

        processor.processMoveable(new Moveable() {
            @Override
            public void run() {
                System.out.println("run");
            }

            @Override
            public void fly() {
                System.out.println("fly");
            }
        });
    }


}
