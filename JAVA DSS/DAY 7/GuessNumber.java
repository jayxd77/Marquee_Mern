import java.util.Scanner;

public class GuessNumber {

    static void guessNumber(int number) {

        Scanner sc = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Enter number: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Number is big"); 
            }
            else if (guess < number) {
                System.out.println("Number is too small");
            }
            else {
                System.out.println("Number guess right yeahhhh!!!");
            }

        } while (guess != number);
        sc.close();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to guess: ");
        int number = sc.nextInt();

        guessNumber(number);
        sc.close();
    }
}