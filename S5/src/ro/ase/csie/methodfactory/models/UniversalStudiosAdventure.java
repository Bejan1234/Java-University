package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;

public class UniversalStudiosAdventure extends AMovie{
    UniversalStudiosAdventure(String title) {
        super(title);
    }

    @Override
    public void print()
    {
        System.out.println("Universal Studios Adventure");
    }
}
