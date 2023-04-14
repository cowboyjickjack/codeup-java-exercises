package movies;

import util.Input;

public class MoviesApplication {

    public static String menu = """
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category""";

    public static void main(String[] args) {
        Input input = new Input();

        int userChoice = -1;
        while (userChoice != 0){
            userChoice = input.getInt(menu);
            switch (userChoice){
                case 1:
                    for (Movie movie: MoviesArray.find)
            }
        }
    }

}
