import clas.Cast;
import clas.Director;
import clas.Movie;
import interfac.FindAbleImpl;
import interfac.SortAbleImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cast> casts = new ArrayList<>();
        casts.add(new Cast("Vin diesel","Dominic"));
        ArrayList<Cast> casts1 = new ArrayList<>();
        casts1.add(new Cast("Robert Patinson","Eduard"));

        Director director1 = new Director("c","Ken");
        Director director2 = new Director("Bob","Ken");
        Director director3 = new Director("Aob","Ken");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add( new Movie("Forsaj 7 ",2023,"Fantastic",director1,casts));
        movies.add( new Movie("Forsaj 6 ",2011,"History",director2,casts1));
        movies.add( new Movie("Forsaj 3 ",2020,"Romantic",director3,casts));

        FindAbleImpl findAble = new FindAbleImpl();
        SortAbleImpl sortAble = new SortAbleImpl();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1.Get all movie
                    2.Find movie by name
                    3.Find movie by actor name
                    4.Find movie by year
                    5.Find movie by director
                    6.Find movie by description
                    7.Find movie by role
                    8.Sort by movie name
                    9.Sort by movie year
                    10.Sort by movie director""");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Choose the one you want");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            int a = scanner.nextInt();
            switch (a){
                case 1-> System.out.println(findAble.getAllMovies(movies));
                case 2-> findAble.findMovieByName(movies);
                case 3-> findAble.findMovieByActorName(movies);
                case 4-> findAble.findMovieByYear(movies);
                case 5-> findAble.findMovieByDirector(movies);
                case 6-> findAble.findMovieByDescription(movies);
                case 7-> findAble.findMovieByRole(movies);
                case 8-> sortAble.sortByMovieName(movies);
                case 9-> sortAble.sortByYear(movies);
                case 10-> sortAble.sortByDirector(movies);
            }
        }
    }
}
