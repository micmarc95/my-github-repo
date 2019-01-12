package pl.com.marcinkowski.java14.solid.open_close_principle;

public class BetterSecret {
    private final String mySecret;
    private Saver<BetterSecret> secretSaver;

    public BetterSecret(String mySecret, Saver secretSaver) {
        this.mySecret = mySecret;
        this.secretSaver = secretSaver;
    }

    public void save(){
        secretSaver.save(this);
    }

    public String getMySecret() {
        return mySecret;
    }

    public void setSecretSaver(Saver<BetterSecret> secretSaver) {
        this.secretSaver = secretSaver;
    }

    public Saver getSecretSaver() {
        return secretSaver;
    }

    @Override
    public String toString() {
        return "BetterSecret{" +
                "mySecret='" + mySecret + '\'' +
                ", secretSaver=" + secretSaver +
                '}';
    }
}
