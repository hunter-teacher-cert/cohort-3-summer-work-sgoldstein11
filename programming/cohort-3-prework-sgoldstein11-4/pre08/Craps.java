import java.util.Random;
import java.util.Scanner;

class Craps {
    static int wins = 0;
    static int loss = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRounds;
        while(true) {
            System.out.println("How many rounds will the game be? [2 - 5]");
            numberOfRounds = sc.nextInt();
            if (numberOfRounds >= 2 && numberOfRounds <= 5) {
                break;
            }
        }



         do {
             int point = 0;
             boolean win;
             System.out.println("Number of rounds left " + numberOfRounds);
             int number = roll();
             System.out.println("The first number is " + number);
             int number2 = roll();
             System.out.println("The second number is "+ number2);
             int result = shoot(number,number2);
             System.out.println("The result is " + result);

             win = true;


            boolean play = round(result);
            if (play) {
                wins++;
            } else {
                loss++;
            }

            System.out.println("You have " + wins + " wins");
            System.out.println("You have " + loss + " losses");
            numberOfRounds--;
        } while(numberOfRounds != 0);
    }

    public static int roll() {
        Random random = new Random();
        int die = random.nextInt(6)+1;
        return die;
    }

    public static int shoot(int number, int number2) {
        return (number + number2);
    }

    
    public static boolean round(int result) {
        if (result ==7 || result==11) {
            System.out.println("You won!");
            return true;
        }
        else if (result == 3 || result ==2 || result ==12) {
            System.out.println ("Sorry,you lose");
            return false;
        } else {
            int secondRollResult;
            while(true) {
                int num1 = roll();
                int num2 = roll();
                secondRollResult = shoot(num1, num2);
                System.out.println("First roll result is : " + result + " Second roll result is " + secondRollResult);
                if (secondRollResult == result) {
                    System.out.println("You won!");
                    return true;
                } else if (secondRollResult == 7) {
                    System.out.println ("Sorry,you lose");
                    return false;
                }
            }
        }
    }
}

      
  




