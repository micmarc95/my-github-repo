package pl.com.marcinkowski.java14.solid.interface_segregation;

public class ChineseWrapperEngine implements RunEngine {

    private ChineseEngine chineseEngine;

    public ChineseWrapperEngine(ChineseEngine chineseEngine) {
        this.chineseEngine = chineseEngine;
    }

    @Override
    public void start() {
        chineseEngine.sfaafaffafa();
    }

    @Override
    public void stop() {
        chineseEngine.aaaaaaaggggg();
    }
}
