import java.util.Random;
import java.util.Scanner;

public class Project {


    public static void main(String[] args) {
        boolean hasWon = false;
        int j = 0;

        String[] myMovies = {"the shawshank redemption",
                "the godfather",
                "the dark knight",
                "schindler's list",
                "pulp fiction",
                "the lord of the rings",
                "the good the bad and the ugly",
                "fight club",
                "the lord of the rings",
                "forrest gump",
                "star wars",
                "inception",
                "the lord of the rings",
                "the matrix",
                "samurai",
                "star wars",
                "city of god",
                "the silence of the lambs",
                "batman begins",
                "die hard",
                "chinatown",
                "room",
                "dunkirk",
                "fargo",
                "no country for old men"};
        Random r = new Random();
        int randomNumber = r.nextInt(myMovies.length);
        System.out.println(myMovies[randomNumber]);

        String hidden = new String(new char[myMovies[randomNumber].length()]).replace('\0', '_');
        System.out.println(hidden);


        System.out.println("I have randomly chosen a Movie.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again.");
            String guess = scanner.nextLine();
            char currentGuess = guess.charAt(0);
            String s = Character.toString(currentGuess);
            System.out.println("Your guess was :" + currentGuess);
            for (int k = 0; k <= myMovies[randomNumber].length() - 1; k++) {
                char current = myMovies[randomNumber].charAt(k);
                String m = Character.toString(current);

                if (m == s) {
                    System.out.println("You guessed a correct letter");
                    char[] charHidden = hidden.toCharArray();
                    charHidden[k] = current;
                    hidden = String.valueOf(charHidden);
                    System.out.println(m);

                } else if (!s.matches("[a-z]")) {
                    System.out.println("That is not a letter.");
                }

            }


        }
    }
}

