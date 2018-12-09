package pl.com.marcinkowski.java14.null_avoid;

public class Bathroom {
    private Sink sink;

    public Bathroom(Sink sink){
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "sink=" + sink +
                '}';
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }
}
