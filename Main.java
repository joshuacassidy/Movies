import java.util.*;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String category(){
        return "Category not listed";
    }

    public String getName() {
        return name;
    }
}

class FightClub extends Movie{
    public FightClub(){
        super("Fight Club");
    }

    public String category(){
        return "Thriller";
    }
}

class Drive extends Movie{
    public Drive(){
        super("Drive");
    }

    public String category(){
        return "Sci-Fi";
    }
}

class PulpFiction extends Movie{
    public PulpFiction(){
        super("PulpFiction");
    }

    public String category(){
        return "Thriller";
    }
}

class DieHard extends Movie{
    public DieHard(){
        super("Die Hard");
    }

    public String category(){
        return "Action";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    public String category(){
        return "Sci-Fi";
    }
}

class MovieNotListed extends Movie {
    public MovieNotListed() {
        super("Not Listed");
    }
}
public class Main {
    public static Random rand = new Random();

    public static void main(String[] args){
        for(int i = 0; i < rand.nextInt(20) + 1; i++){
            Movie movie = randomMovie();
            System.out.printf("Movie No. %d: %s\nCategory: %s.\n", (i+1), movie.getName(), movie.category());
        }
    }
    public static Movie randomMovie(){
        
        int randomNumber = rand.nextInt(5);
        return randomNumber == 1 ? new FightClub() : randomNumber == 2 ?   new Drive() : randomNumber == 3 ? new PulpFiction() : randomNumber == 4 ? new StarWars() : randomNumber == 5 ? new DieHard() : new MovieNotListed();
        
    }
}