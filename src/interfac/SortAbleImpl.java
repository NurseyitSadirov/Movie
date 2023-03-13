package interfac;
import clas.Movie;
import java.util.Comparator;
import java.util.List;

public class SortAbleImpl implements SortAble{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(movie);
        for (Movie movie2 : movies) {
            System.out.println(movie2);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(movie1);
        for (Movie movie2 : movies) {
            System.out.println(movie2);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(movie3);
        for (Movie movie2 : movies) {
            System.out.println(movie2);
        }

    }

    Comparator<Movie> movie = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    Comparator<Movie> movie1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    }; Comparator<Movie> movie3 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

}
