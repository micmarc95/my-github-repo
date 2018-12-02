package pl.com.marcinkowski.java14.roslinki;

public class Gardener {
    public void waterPlant (Plant plant){
        plant.increaseWaterLevel (plant.getRequiredIncreaseInWaterLevelInMl());
    }
    public void makePlantGrow(Plant plant){
        plant.grow();
    }
}
