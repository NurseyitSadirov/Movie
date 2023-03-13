package interfac;
import clas.Cast;
import clas.Movie;
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
        String name = new Scanner(System.in).nextLine().toUpperCase().trim();
        try {
            for (Movie movie : movies) {
                if (movie.getName().toUpperCase().trim().equals(name)) {
                    System.out.println(movie);
                } else {
                    throw new RuntimeException("There is no such film");
                }
            }
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write the name of the actor ");
        String actorName = new Scanner(System.in).nextLine();
        try {
            for (Movie movie : movies) {
                if (movie.getCast().get(0).getActorFullName().equals(actorName)) {
                    System.out.println(movie);
                } else {
                    throw new NullPointerException("No such of the actor");
                }
            }
        } catch (Exception e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write the year of the movie");
        int year = new Scanner(System.in).nextInt();
        try {
            for (Movie movie : movies) {
                if (movie.getYear() == year) {
                    System.out.println(movie);
                } else {
                    throw new ArithmeticException("There is no movie this year");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Write the director of the movie");
        String directorName = new Scanner(System.in).nextLine().toUpperCase().trim();
        try {
            for (Movie movie : movies) {
                if (movie.getDirector().getName().toUpperCase().trim().contains(directorName)){
                    System.out.println(movie);
                }else {
                    throw new NullPointerException("We don't have such a director");
                }
            }
        }catch (NullPointerException e){
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Write the description of the movie");
        String description = new Scanner(System.in).nextLine().toUpperCase();
        try {
            for (Movie movie : movies) {
                if (movie.getDescription().toUpperCase().equals(description)){
                    System.out.println(movie);
                }else {
                    throw new NullPointerException("We don't have such a description");
                }
            }
        }catch (NullPointerException e){
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write the role of the movie");
        String role = new Scanner(System.in).nextLine().toUpperCase().trim();
        try {
            for (Movie movie : movies) {
                for (Cast c:movie.getCast()) {
                if (c.getRole().toUpperCase().trim().equals(role)){
                    System.out.println(movie);
                }else {
                    throw new RuntimeException("There is no actor in this role");
                }
            }
            }
        }catch (RuntimeException e){
            System.out.println("~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
            System.out.println("~~~~~~~~~~~~~");
        }

    }
}