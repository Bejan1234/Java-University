package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;

public class MarvelStudiosAdventure extends AMovie {
    MarvelStudiosAdventure(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("Marvel Studios Adventure");
    }
}
