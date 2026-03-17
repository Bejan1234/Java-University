package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IDefendable;

public class GameCharacter {
    private String nume;
    private int hitPoints;
    private int healthPoints;
    private AWeapon weapon;

    public GameCharacter(String nume, int hitPoints, int healthPoints, AWeapon weapon) {
        this.nume = nume;
        this.hitPoints = hitPoints;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public void play() {
        weapon.use(hitPoints);
    }

    public void setWeapon(AWeapon weapon) {
        this.weapon = weapon;
    }
}
