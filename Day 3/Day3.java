import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        // // Associativity
        // int number = 9 * 3 + 18 / 9;
        // System.out.println(number);

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = my_scan.nextInt();

        // if (age >= 18 && age <= 60) {
        // System.out.println("You can dive...");
        // } else if (age >= 60) {
        // System.out.println("You are too late.");
        // } else {
        // System.out.println("Sorry, stay safe...");
        // }

        // switch (age) {
        // case 15:
        // System.out.println("You can learn to dive, but not practical!");
        // break;
        // case 10:
        // System.out.println("Too early!");
        // break;
        // default:
        // System.out.println("No special cases!!!");

        // }
        int day = 5;
        String numLetters = switch (day) {
            case 5 -> "FRI";
            case 6 -> "SAT";
            case 7 -> "SUN";
            default -> "INVALID DAY";

        };
        System.out.println(numLetters);
        System.out.println("\n\nEXIT SWITCH");

        // break --- get out of that code block
        // continue --- only skips that particular iteration
    }
}

// ACTIVITY: Make a program in which we get input from user on a letter, then
// define it as a vowel or consonant. If we get A in input add 1 in A to make it
// B.

