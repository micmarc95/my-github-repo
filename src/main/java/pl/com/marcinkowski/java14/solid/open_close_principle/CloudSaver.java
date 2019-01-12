package pl.com.marcinkowski.java14.solid.open_close_principle;

public class CloudSaver implements Saver<BetterSecret> {
    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving to cloud...");
    }
}
