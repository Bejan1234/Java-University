package ro.ase.csie.methodfactory;

import ro.ase.csie.methodfactory.models.MovieType;
import ro.ase.csie.methodfactory.abstracts.AMovie;
import ro.ase.csie.methodfactory.abstracts.IFactory;
import ro.ase.csie.methodfactory.models.MarvelStudiosFactory;
import ro.ase.csie.methodfactory.models.UniversalStudiosFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new MarvelStudiosFactory();
        AMovie movie = factory.getMovie(MovieType.ADVENTURE, "Spider-Man");
        movie.print();
        factory = new UniversalStudiosFactory();
        movie = factory.getMovie(MovieType.ROMANCE, "The Notebook");
        movie.print();
    }
}

