package pl.com.marcinkowski.java14.sorting;

public class Cloth {
    private boolean cleanOrDirty;
    private int size;

    public Cloth(boolean cleanOrDirty, int size) {
        this.cleanOrDirty = cleanOrDirty;
        this.size = size;
    }

    public boolean isCleanOrDirty() {
        return cleanOrDirty;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "cleanOrDirty=" + cleanOrDirty +
                ", size=" + size +
                '}';
    }
}
