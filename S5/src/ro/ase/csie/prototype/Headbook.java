package ro.ase.csie.prototype;

import java.util.ArrayList;
import java.util.List;

public class Headbook implements Cloneable {
    List<Integer> friends = new ArrayList<>();

    public Headbook(List<Integer> friends) {
        System.out.println("Retrieving list from the server...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.friends = friends;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { //DEEP COPY
        Headbook clone = (Headbook) super.clone();
        clone.friends = new ArrayList<>();
        for(Integer i : this.friends)
            clone.friends.add(i); // atentie la cazurile unde avem tipuri referentiale in loc de primitive
        return clone;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Headbook{");
        sb.append("friends=").append(friends);
        sb.append('}');
        return sb.toString();
    }
}
