package pl.com.marcinkowski.java14.generic;

public class GenericHolder<E> {

    E secret;

    public E getSecret(){
        return secret;
    }

    public void setSecret(E secret){
        this.secret = secret;
    }
}
