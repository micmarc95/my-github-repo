package pl.com.marcinkowski.java14.roslinki;

public class Plant {
    protected int heightInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;

    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }

    public int getCurrentWaterLevelInMl() {
        return currentWaterLevelInMl;
    }

    public void grow() {
        //empty
    }
    public void increaseWaterLevel(int waterUseInMl){
        currentWaterLevelInMl += waterUseInMl;
    }
    public int getRequiredIncreaseInWaterLevelInMl(){
       return 0;
    }
}


