package pl.com.marcinkowski.java14.solid.liskov_substitution;

public class FeaturePhone {

    protected String model;

    protected boolean canBeEqual(){
        return true;
    }

    public FeaturePhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeaturePhone)) {
            return false;
        }

        //if (o == null || getClass() != o.getClass()) return false;

        FeaturePhone that = (FeaturePhone) o;

        if (!that.canBeEqual()){
            return false;
        }


        return model != null ? model.equals(that.model) : that.model == null;
    }



}
