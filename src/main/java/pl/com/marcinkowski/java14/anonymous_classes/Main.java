package pl.com.marcinkowski.java14.anonymous_classes;

public class Main {

    public static void main(String[] args) {

        Animal monkey = new Monkey();
        Animal parrot = new Animal() {   // klasa nie ma nazwy i dziedziczy po animalu - klasa anonimowa
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };

        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }
//
//            public void makeSound(){
//                System.out.println("kwa kwa");
//            }
        };

        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck!!!");
            }
        });

        Monkey monkey1 = new Monkey(){
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };

        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Secret");
            }
        };

        SecretProcessor secretProcessor = new SecretProcessor();
        secretProcessor.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Secret numero 2");
            }
        });

    }
}
