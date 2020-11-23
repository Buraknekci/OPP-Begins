
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats man";
    }
}

class IndependentsDay extends Movie {


    public IndependentsDay() {
        super(" Independece day");
    }

    @Override
    public String plot() {
        return " aliens takes world";

    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("maze runner");
    }

    @Override
    public String plot() {
        return " kids kill eachothers";

    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");

    }

    @Override
    public String plot() {
        return " war in the space";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgateble");

    }
}


public class PolymophismMovie {


    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie " + i +
                    ": " + movie.getName() + " \n " +
                    "plot :" + movie.plot() + "\n"
            );


        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number genareted was :" + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependentsDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }

}
