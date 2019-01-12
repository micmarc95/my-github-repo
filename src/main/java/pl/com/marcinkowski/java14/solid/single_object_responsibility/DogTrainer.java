package pl.com.marcinkowski.java14.solid.single_object_responsibility;

public class DogTrainer {
    private String name;

    public DogTrainer(String name) {
        this.name = name;
    }

    public void trainDog (Dog dog){

        System.out.println(String.format("Dog [%s] is trained by: [%s]", dog.getName(), name));
    }

    public void goForWalk (Dog dog){
        System.out.println(String.format("Dog [%s] is going for a walk with : [%s]", dog.getName(), name));
    }

    public void firstAid (Dog dog){
        System.out.println(String.format("Dog [%s] is being healed by : [%s]", dog.getName(), name));
    }

    public void feedDog (Dog dog){
        System.out.println("Feeding dog " + dog.getName() + " by: " + name);
    }

    @Override
    public String toString() {
        return "DogTrainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
