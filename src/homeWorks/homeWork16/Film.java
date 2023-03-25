package homeWorks.homeWork16;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String name;
    private int year;
    private String director;
    private int rating;

    public Film(String name, int year, String genres, int rating) {
        this.name = name;
        this.year = year;
        this.director= genres;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}


