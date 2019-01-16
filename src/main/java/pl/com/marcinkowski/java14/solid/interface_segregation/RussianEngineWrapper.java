package pl.com.marcinkowski.java14.solid.interface_segregation;

public class RussianEngineWrapper implements RunEngine {

    private RussianEngine russianEngine;

    public RussianEngineWrapper(RussianEngine russianEngine) {
        this.russianEngine = russianEngine;
    }

    @Override
    public void start() {
        russianEngine.dawaj();

    }

    @Override
    public void stop() {

        russianEngine.dawaj();
        russianEngine.dawaj();
    }
}
