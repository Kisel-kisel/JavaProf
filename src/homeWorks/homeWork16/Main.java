package homeWorks.homeWork16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> directory = new ArrayList<>();
        Film first = new Film("first", 1978, "drama", 7);
        Film second = new Film("second", 1988, "Action", 7);
        Film third = new Film("third", 1998, "Horror", 7);
        Film fouth = new Film("fouth", 2028, "Comedy", 7);

        directory.add(first);
        directory.add(second);
        directory.add(third);
        directory.add(fouth);

        System.out.println(directory);
//        directory.stream().map()

//        List <Film> direct = directory.stream()

    }
}
