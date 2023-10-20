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

        //get user input and validate 3-digit number
        int user_3_digit_number = 0;
        boolean is_valid_3_digit_number = false;
        while(!is_valid_3_digit_number)
        {
            //receive user input for a 3-digit number
            System.out.print("Enter a 3-digit number: ");
            user_3_digit_number = keyboard.nextInt();
            if(user_3_digit_number>99 && user_3_digit_number<1000)
            {
                is_valid_3_digit_number = true;
            }
        }

        //make instance of NumberManipulator object
        NumberManipulator manipulator = new NumberManipulator();

        //call sumOfDigits
        int sum_of_digits = manipulator.sumOfDigits(user_3_digit_number);
        System.out.printf("The sum of the digits is %d%n",sum_of_digits);

        //call reverseNumber
        String reversed_numbers = manipulator.reverseNumber(user_3_digit_number);
        System.out.printf("In reverse the numbers are %s%n",reversed_numbers);

        //call toArray
        int[] array_of_digits = manipulator.toArray(user_3_digit_number);
        System.out.println("Printing Array");
        for (int i = 0; i < array_of_digits.length; ++i) {
            System.out.println(array_of_digits[i]);
        }
    }
}