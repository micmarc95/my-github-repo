package pl.com.marcinkowski.java14.solid.interface_segregation;

public class WashMachine {

    private RunEngine engine;

    public WashMachine(RunEngine engine) {
        this.engine = engine;
    }

    public void beginWash(){
        engine.start();
        System.out.println("beginWash()");
    }

    public void endWash(){
        engine.stop();
        System.out.println("endWash()");
    }
}
