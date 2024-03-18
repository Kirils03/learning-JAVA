import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Pls ennter a word");
        String word =  MyScanner.nextLine();

        String iterated = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            iterated = iterated + word.charAt(i);
        }
        if(word.equals(iterated)){
            System.out.println("Is a palindrome");
        }
        else {System.out.println("Is NOT a palindrome");}
    }
}
