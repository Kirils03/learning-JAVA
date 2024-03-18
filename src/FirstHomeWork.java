import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {

        //1)Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."
//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter a positive number");
//        int number = MyScanner.nextInt();
//        if (number<0){
//            System.out.println("Not a positive number");
//        }else{
//            System.out.println("Is Positive");
//        }


        //2)Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."

//        Scanner MyScanner = new Scanner(System.in);
//      System.out.println("Enter an even number");
//        int number = MyScanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Not an even number");
//        }


        //3)Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."
//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = MyScanner.nextInt();
//        if (age < 18) {
//            System.out.println("Teenager");
//        } else {
//            System.out.println("Adult");
//


        //4)Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."

//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter Year");
//        int year = MyScanner.nextInt();
//        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("Leap year");
//        }else{
//            System.out.println("Not a leap year");
//        }

        //Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."


//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter number that is positive, even, and less than 100");
//        float number = MyScanner.nextFloat();
//        if(number > 0 && number < 100 && number % 2 == 0) {
//            System.out.println("Valid number");
//        }else {
//            System.out.println("Incorrect number");
//        }

        //Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."

//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int number = MyScanner.nextInt();
//        if (number > 0) {
//            if (number % 2 == 0) {
//                System.out.println("Positive and Even.");
//            } else {
//                System.out.println("Positive but Not Even.");
//            }
//        } else {
//            System.out.println("Not a Positive number.");
//
//        }
        //Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)
//        Scanner MyScanner = new Scanner(System.in);
//        System.out.println("Enter Char");
//        char letter = MyScanner.next().charAt(0);
//        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Not a vowel");
//        }

        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height);

//        Scanner MyScanner = new Scanner(System.in);
//        System.out.print("Enter weight: ");
//        float weight = MyScanner.nextFloat();
//        System.out.print("Enter height in meters: ");
//        float height = MyScanner.nextFloat();
//        float BMI = weight / (height * height);
//        System.out.println("BMI: " + BMI);
//        if (BMI < 18.5) {
//            System.out.println("Underweight");
//        } else if (BMI < 25) {
//            System.out.println("Normal");
//        } else if (BMI < 30) {
//            System.out.println("Overweight");
//        }


//Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average.
        Scanner MyScanner = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        int mathScore = MyScanner.nextInt();
        System.out.print("Enter Science score: ");
        int scienceScore = MyScanner.nextInt();
        System.out.print("Enter English score: ");
        int englishScore = MyScanner.nextInt();

        double averageScore = (mathScore + scienceScore + englishScore) / 3.0;

        System.out.println("Average score: " + averageScore);

        if (averageScore >= 90) {
            System.out.println("Final grade: A");
        } else if (averageScore >= 80) {
            System.out.println("Final grade: B");
        } else if (averageScore >= 70) {
            System.out.println("Final grade: C");
        } else if (averageScore >= 60) {
            System.out.println("Final grade: D");
        } else {
            System.out.println("Final grade: F");
        }


        }


    }