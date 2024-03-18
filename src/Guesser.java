import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random RandomNumber = new Random();
        int number = RandomNumber.nextInt(10) + 1;
        System.out.println("Guess number between 1 and 10: " + RandomNumber);
        int answer = input.nextInt();
        if (number == answer) {
            System.out.println("You Guessed number");

        } else {
            System.out.println("Incorrect, number was:" + number);
        }
        boolean isGuessed = false;
        {
            while (!isGuessed) {
                if (number == answer) {
                    System.out.println("You Guessed number");
                    isGuessed = true;
                } else { System.out.println("Incorrect");
                    answer = input.nextInt();

                }

                }
            }

        }

    }