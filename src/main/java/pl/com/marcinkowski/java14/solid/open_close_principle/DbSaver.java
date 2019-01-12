package pl.com.marcinkowski.java14.solid.open_close_principle;

public class DbSaver implements Saver<BetterSecret> {
    String user;
    String password;
    String connectionUrl;


    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving to database...");
    }
}
