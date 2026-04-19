package ro.ase.csie.methodfactory.models;

import ro.ase.csie.methodfactory.abstracts.AMovie;
import ro.ase.csie.methodfactory.abstracts.IFactory;

public class MarvelStudiosFactory implements IFactory {

    @Override
    public AMovie getMovie(MovieType type, String title) {
        return switch(type) {
            case COMEDY -> new MarvelStudiosComedy(title);
            case ADVENTURE -> new MarvelStudiosAdventure(title);
            case ROMANCE -> new MarvelStudiosRomance(title);
            default -> throw new IllegalArgumentException("Invalid movie type");
        };
    }
}
