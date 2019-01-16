package pl.com.marcinkowski.java14.solid.interface_segregation;

public class PolishWrapperEngine implements RunEngine{

    private RadomEngine radomEngine;

    public PolishWrapperEngine(RadomEngine radomEngine) {
        this.radomEngine = radomEngine;
    }

    @Override
    public void start() {
        radomEngine.start();
    }

    @Override
    public void stop() {
        radomEngine.stop();
    }
}
