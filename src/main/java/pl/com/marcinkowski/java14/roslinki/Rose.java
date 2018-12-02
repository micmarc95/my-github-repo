package pl.com.marcinkowski.java14.roslinki;

public class Rose extends Plant {
    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 5;
        currentWaterLevelInMl -= waterUseInMl;

    }

    @Override
    public int getRequiredIncreaseInWaterLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
