package ro.csie.ase.abstracts;

import java.lang.reflect.Array;

public abstract class AWeapon {
    String name;
    int[] model;
    protected int hitPoints;

    public AWeapon(int[] model, String name) {
        this.model = model;
        this.name = name;
    }

    public abstract void use(int hitPoints);
}
