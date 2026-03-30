package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;

public class MarvelStudiosRomance extends AMovie {
    MarvelStudiosRomance(String title) {
        super(title);
    }

    public void print() {
        System.out.println("Marvel Studios Romance");
    }
}
