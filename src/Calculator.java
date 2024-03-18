import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int answer = myScanner.nextInt();

        System.out.println("this is multiplication table:"+ answer);
    }
}
