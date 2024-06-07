import java.util.Random;
import java.util.Scanner;
class Game {
    public int computerNumber;
    public int userNumber;
    public int no_of_guesses = 0;
    public void userNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100: ");
        userNumber = sc.nextInt();
    }
    Game() {
        Random random = new Random();
        computerNumber = random.nextInt(100);
    }
    boolean Iscorrect() {
        if (userNumber == computerNumber) {
            System.out.println("Congratulation You Guessed the correct number in " + no_of_guesses + " attempt");
            return true;
        }
        else if (userNumber < computerNumber) {
            System.out.println("Higher Number please");
        }
        else if (userNumber > computerNumber) {
            System.out.println("Lower number please");
        }
        no_of_guesses++;
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Game mygame = new Game();
        boolean b = false;
        while (!b) {
            mygame.userNumber();
            b = mygame.Iscorrect();
        }
    }
}