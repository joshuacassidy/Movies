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
    public static void main(String[] args){
        for(int i = 0; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie No. " + i + ": " + movie.getName() + "\n" + "Category: " + movie.category());
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        switch (randomNumber){
            case 1:
                return new FightClub();
            case 2:
                return new Drive();
            case 3:
                return new PulpFiction();
            case 4:
                return new StarWars();
            case 5:
                return new DieHard();
            default:
                return new MovieNotListed();
        }
    }
}