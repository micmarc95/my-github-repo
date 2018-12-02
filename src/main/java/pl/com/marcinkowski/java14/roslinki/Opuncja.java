package pl.com.marcinkowski.java14.roslinki;

public class Opuncja extends Plant{
    public Opuncja(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 3;
        currentWaterLevelInMl -= waterUseInMl;

    }

    @Override
    public int getRequiredIncreaseInWaterLevelInMl() {
        return waterUseInMl;
    }

    @Override
    public String toString() {
        return "Opuncja{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
