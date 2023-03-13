package interfac;

import clas.Cast;
import clas.Movie;
import clas.NullPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAbleImpl implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Write the name of the movie ");
        String name = new Scanner(System.in).nextLine();
        List<Movie> list = new ArrayList<>();
        int counter = 0;
        try {
            for (Movie m : movies) {
                if (m.getName().toUpperCase().toUpperCase().trim().equals(name.toUpperCase().trim())) {
                    counter++;
                    list.add(m);
                }
            }

            if (counter > 0) {
                System.out.println(list);
            } else {
                throw new Exception("Not found!");
            }
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write the name of the actor ");
        List<Movie> result = new ArrayList<>();
        String actorName = new Scanner(System.in).nextLine().toUpperCase().trim();
        try {
            for (Movie movie : movies) {
                for (Cast c : movie.getCast()) {
                    if (c.getActorFullName().toUpperCase().trim().contains(actorName)) {
                        result.add(movie);
                    }
                }
            }
            if (!result.isEmpty()){
                System.out.println(result);
            }else {
                throw new NullPoint("No such of the actor");
            }
        } catch (NullPoint e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write the year of the movie");
        int year = new Scanner(System.in).nextInt();
        List<Movie> list = new ArrayList<>();
        try {
            for (Movie movie : movies) {
                if (movie.getYear() == year) {
                    list.add(movie);
                }
            }

            if (!list.isEmpty()) {
                System.out.println(list);
            } else {
                throw new NullPoint("Not found!");
            }
        } catch (NullPoint e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");

        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        try {
            List<Movie> results = new ArrayList<>();
            System.out.println("Write the director of the movie");
            String directorName = new Scanner(System.in).nextLine().toUpperCase().trim();
            for (Movie movie : movies) {
                if (movie.getDirector().getName().toUpperCase().trim().equals(directorName)) {
                    results.add(movie);
                }
            }if (!results.isEmpty()) {
                System.out.println(results);
            }else {
                throw new NullPoint("No director");
            }

        } catch (NullPoint e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Write the description of the movie");
        String description = new Scanner(System.in).nextLine().toUpperCase();
        List<Movie> list = new ArrayList<>();
        try {
            for (Movie movie : movies) {
                if (movie.getDescription().toUpperCase().equals(description)) {
                    list.add(movie);
                }
            }
            if (!list.isEmpty()){
                System.out.println(list);
            }else {
                throw new NullPoint("No description");
            }
        } catch (NullPoint e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write the role of the movie");
        List<Movie> list = new ArrayList<>();        try {
            String role = new Scanner(System.in).nextLine().toUpperCase().trim();
            List<Movie> movies1 = new ArrayList<>();
            for (Movie movie : movies) {
                for (Cast c : movie.getCast()) {
                    if (c.getRole().toUpperCase().trim().equals(role)) {
                        list.add(movie);
                    }
                }
            }
            if (!list.isEmpty()){
                System.out.println(list);
            }else {
                throw new NullPoint("There is no actor in this role");
            }
            System.out.println(movies1);
        } catch (NullPoint e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }

    }
}