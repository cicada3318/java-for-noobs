import java.util.Scanner;

public class Day4 {
    // Loops
    // Loop runs until the condition is true, once condition is false, loop ends.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inp.nextInt();
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        // while (number < 20) {

        // number += 1;
        // if (number == 15) {
        // // System.out.println("\n\nBreaking the loop!");
        // System.out.println("\n\nContinue the loop!");
        // // break;
        // continue;
        // }

        // System.out.println(number);
        // // number++ KA MATLBA HY number = number + 1
        // }

        // while (number < 20) {

        // number++;

        // if (number == 10) {
        // continue;
        // // continue skips the rest of the code of iteration.
        // }

        // System.out.println(number);

        // }

        do {
            System.out.println(number);
            number--;
        } while (number < 10);
    }
}

// ACTIVITY: Write a table backward using do while loop, and ask number from
// user. Also store user's name in a variable.
