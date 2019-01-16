package pl.com.marcinkowski.java14.solid.liskov_substitution;

public class Smartphone extends FeaturePhone {

    public Smartphone(String model) {
        super(model);
    }

    protected boolean canBeEqual(){
        return true;
    }

    @Override
    public String getModel() {
        return "Smartphone: " + super.getModel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) {return false;}
        //if (o == null || getClass() != o.getClass()) return false;

        Smartphone that = (Smartphone) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
