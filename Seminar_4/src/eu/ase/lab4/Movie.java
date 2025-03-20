package eu.ase.lab4;

import java.util.Comparator;
import java.util.Objects;

public class Movie implements Cloneable {

    private int year;
    private String title;
    private float rating;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Movie(int year, String title, float rating) {
        this.year = year;
        this.title = title;
        this.rating = rating;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Movie clone = (Movie) super.clone();
        clone.year = this.year;
        clone.title = this.title;
        clone.rating = this.rating;

        return clone;
    }

    @Override
    public String toString() {
        return String.format("%s from %d has %5.2f", this.title, this.year, this.rating);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Float.compare(rating, movie.rating) == 0 && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, rating);
    }

    //    @Override
//    public int compareTo(Movie o) {
//        if (this.rating == o.getRating()) {
//            return 0;
//        }
//
//        if (this.rating > o.getRating()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}
