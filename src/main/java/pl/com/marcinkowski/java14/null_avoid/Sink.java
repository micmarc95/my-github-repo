package pl.com.marcinkowski.java14.null_avoid;

public class Sink {
    private String label;

    public Sink(String label) {
        this.label = validateLabel(label);     // może być tez:  this.label = setLabel(label)
    }

    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLabel(label);
    }

    private String validateLabel (String label){
        if (null == label) {
            throw new IllegalArgumentException("label cannot be null");
        }
        return label;
    }

}
