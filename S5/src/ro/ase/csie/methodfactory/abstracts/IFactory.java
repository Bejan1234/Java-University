package ro.ase.csie.methodfactory.abstracts;

import ro.ase.csie.methodfactory.models.MovieType;

public interface IFactory {
    public AMovie getMovie(MovieType type, String title);
}
