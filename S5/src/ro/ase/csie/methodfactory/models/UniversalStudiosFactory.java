package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;
import ro.ase.csie.methodfactory.abstracts.IFactory;

public class UniversalStudiosFactory implements IFactory {
    @Override
    public AMovie getMovie(MovieType type, String title) {
        switch (type) {
            case ADVENTURE:
                return new UniversalStudiosAdventure(title);
            case ROMANCE:
                return new UniversalStudiosRomance(title);
            case COMEDY:
                return new UniversalStudiosComedy(title);
            default:
                throw new IllegalArgumentException("Invalid movie type");
        }
    }
}
