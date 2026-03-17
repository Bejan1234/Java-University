package ro.csie.ase;

import ro.csie.ase.models.GameCharacter;
import ro.csie.ase.models.Shield;
import ro.csie.ase.models.Sword;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(new int[]{999,123,22}, "Saboi");
        Shield shield = new Shield(new int[]{123,54,2}, "Scutz");
        GameCharacter gc = new GameCharacter("Marioan",15,100, sword);
        gc.play();
        gc.setWeapon(shield);
        gc.play();
    }
}