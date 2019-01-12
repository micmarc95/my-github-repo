package pl.com.marcinkowski.java14.solid.open_close_principle;

public class Main {

    public static void main(String[] args) {

        Secret secret = new Secret("Radek lubi w pupę", "C:\\Users\\Michał\\Desktop\\Secret.txt");

        secret.save();

        // 2 implementacje Saver
        // pierwsza zapis w pliku
        // druga zapis w bazie
        // użycie z jednym sekretem

        Saver<BetterSecret> filesaver = new FileSaver();
        Saver<BetterSecret> dbSaver = new DbSaver();
        Saver<BetterSecret> cloudSaver = new CloudSaver();

        BetterSecret betterSecret = new BetterSecret("Super tajny...", filesaver);
        betterSecret.save();
        betterSecret.setSecretSaver(dbSaver);
        betterSecret.save();
        betterSecret.setSecretSaver(cloudSaver);
        betterSecret.save();

    }
}
