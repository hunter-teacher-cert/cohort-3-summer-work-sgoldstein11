import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        // pick a random number
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guessNum;
        

        System.out.println("What number are you guessing between 1 and 100? ");
        guessNum = in.nextInt();

        System.out.println("The number you are guessing is: " + guessNum);

        System.out.println("The number I was thinking of is: " + number);

        System.out.println("You were off by: " + (number - guessNum) );

        
    }
}