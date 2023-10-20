import java.util.Scanner;

/*
 * Author: Aaron M. Arreola
 * File  : Main.java
 * Date  : 10/19/2023
 */
public class Main {
    public static void main(String[] args) {
        // create scanner for input from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        //receive user input for a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int user_3_digit_number = keyboard.nextInt();

        //make instance of NumberManipulator object
        NumberManipulator manipulator = new NumberManipulator();

        //call sumOfDigits
        int sum_of_digits = manipulator.sumOfDigits(user_3_digit_number);
        System.out.println(sum_of_digits);

        //call reverseNumber
        String reversed_numbers = manipulator.reverseNumber(user_3_digit_number);
        System.out.println(reversed_numbers);

        //call toArray
        int[] array_of_digits = manipulator.toArray(user_3_digit_number);
        for (int i = 0; i < 3; ++i) {
            System.out.println(array_of_digits[i]);
        }
    }
}