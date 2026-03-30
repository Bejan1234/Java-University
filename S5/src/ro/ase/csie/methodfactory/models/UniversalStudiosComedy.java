package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;

public class UniversalStudiosComedy extends AMovie {

    UniversalStudiosComedy(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("Universal Studios Comedy");
    }
}
