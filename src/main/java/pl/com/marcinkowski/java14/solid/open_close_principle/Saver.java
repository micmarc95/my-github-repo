package pl.com.marcinkowski.java14.solid.open_close_principle;

public interface Saver<T> {
    void save (T secret);
}
