package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IAttackable;
import ro.csie.ase.abstracts.IDefendable;

public class Sword extends AWeapon implements IAttackable {
    public Sword(int[] model, String name) {
        super(model, name);
    }

    @Override
    public void attack(int hitPoints) {
        System.out.println("Atac cu sabia cu " + hitPoints);
    }


    @Override
    public void use(int hitPoints) {
        this.attack(hitPoints);
    }
}
