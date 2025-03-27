import java.util.*;

public class Main {
    public static void main(String[] args) {

        Movie m1 = new Movie(1, 2025, "Anora", 8.5f);
        Movie m2 = new Movie(2, 2024, "Oppenheimer", 8.9f);
        Movie m3 = new Movie(3, 2023, "Everything, everywhere", 8.7f);

        Map<Integer, Movie> movieMap = new HashMap<>();

        movieMap.put(m1.hashCode(), m1);
        movieMap.put(m2.hashCode(), m2);
        movieMap.put(m3.hashCode(), m3);

        Set<Integer> keySet = movieMap.keySet();
        Iterator<Integer> it = keySet.iterator();

        for (;it.hasNext();) {
            Integer key = it.next();
            System.out.println("Key " + key + ": " + movieMap.get(key));
        }

        SortedMap<Integer, Movie> treeMap = new TreeMap<>();

        treeMap.put(m1.hashCode(), m1);
        treeMap.put(m2.hashCode(), m2);
        treeMap.put(m3.hashCode(), m3);

        keySet = treeMap.keySet();
        it = keySet.iterator();

        for (;it.hasNext();) {
            Integer key = it.next();
            System.out.println("Key " + key + ": " + treeMap.get(key));
        }
    }
}