package pl.com.marcinkowski.java14.roslinki;

public class Cactus extends Plant {
    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 1;
        currentWaterLevelInMl -= waterUseInMl;

    }

    @Override
    public int getRequiredIncreaseInWaterLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
