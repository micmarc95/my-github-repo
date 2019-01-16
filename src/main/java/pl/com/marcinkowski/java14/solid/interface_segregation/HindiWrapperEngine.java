package pl.com.marcinkowski.java14.solid.interface_segregation;

public class HindiWrapperEngine implements RunEngine {

    private HindiEngine hindiEngine;

    public HindiWrapperEngine(HindiEngine hindiEngine) {
        this.hindiEngine = hindiEngine;
    }

    @Override
    public void start() {
        hindiEngine.h1();
        hindiEngine.h2();
    }

    @Override
    public void stop() {
        hindiEngine.h5();
        hindiEngine.h7();
    }
}
