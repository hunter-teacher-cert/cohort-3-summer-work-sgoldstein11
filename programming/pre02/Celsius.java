import java.util.Scanner;


public class Celsius {

    public static void main(String[] args) {
        double CTemp,FTemp;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("What is the Celsius temp you want to convert?  ");
        CTemp = in.nextDouble();

        // convert and output the result
        FTemp = CTemp * 1.8 + 32;
        System.out.println(CTemp + " is " + FTemp + " degrees F.");
    }
}