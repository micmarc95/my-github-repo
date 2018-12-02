package pl.com.marcinkowski.java14;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;

    ///////////////////////////////////////////////////////////////////////

    public Person(String imie, String nazwisko, int wiek) {
        setImie(imie);
        setNazwisko(nazwisko);
        setWiek(wiek);
    }

    public Person(String imie, String nazwisko) {
        setImie(imie);
        setNazwisko(nazwisko);
        this.wiek = -1; // dodajemy mimo wszystko opcję i wtedy gdy nie podaje się argumentu to przyjmuje taką wartość, tak samo można zrobić ze stringiem
    }

    /////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        Person Person1 = new Person("Michał", "MarcinkowskiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", -5);
        Person Person2 = new Person("Radekkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "Kulikowski", 24);
        Person Person3 = new Person ("Andrzej","Bednarek",232);


        System.out.println(Person1);
        System.out.println(Person2);
        System.out.println(Person3);
    }

    /////////////////////////////////////////////////////////////////////////

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie.length() > 20) {
            this.imie = imie.substring(0,20);
            System.out.println(imie + " - imie zbyt długie - przycieto do 20 znaków");
        } else this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {

        if(nazwisko.length() > 20){
            System.out.println(nazwisko + " - nazwisko zbyt długie - przypisano null");
            this.nazwisko = "null";
        } else this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    // jeśli nie chemy podawać wieku to jeszcze jeden konstruktor bez wieku

    public void setWiek(int wiek) {
        if(wiek < 0){
          this.wiek=0;
            System.out.println(getImie() + ": Wiek zbyt niski - przypisano 0");
        } else if (wiek > 200) {
            this.wiek=200;
            System.out.println(getImie() + ": Wiek zbyt wysoki - przypisano 200");
        } else {
            this.wiek = wiek;
            System.out.println(getImie() + ": Wiek OK - mieści się między 0 i 200");
        }


    }

    //////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

}
