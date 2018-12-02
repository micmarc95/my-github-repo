package pl.com.marcinkowski.java14;

public class Dog {
    private String rasa;
    private String kolor;
    private int liczba_nóg;

    public Dog(String rasa, String kolor, int liczba_nóg) {
        this.rasa = rasa;
        this.kolor = kolor;
        this.liczba_nóg = liczba_nóg;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getLiczba_nóg() {
        return liczba_nóg;
    }

    public void setLiczba_nóg(int liczba_nóg) {
        this.liczba_nóg = liczba_nóg;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", liczba_nóg=" + liczba_nóg +
                '}';
    }

    public static void main(String[] args) {
        Dog Marcin = new Dog("Owczarek","czarny",4);
        Dog Radek = new Dog("Kundel","rudy",3);

        System.out.println(Marcin);
        System.out.println(Radek);

    }


}

