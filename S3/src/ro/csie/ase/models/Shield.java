package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IDefendable;

public class Shield extends AWeapon implements IDefendable {


    public Shield(int[] model, String name) {
        super(model, name);
    }

    @Override
    public void use(int hitPoints) {
        this.defend(hitPoints);
    }


    @Override
    public void defend(int hitPoints) {
        System.out.println("Ne aparam cu scutul de " + hitPoints);
    }
}
