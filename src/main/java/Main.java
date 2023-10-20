/*
 * Author: Aaron M. Arreola
 * File  : Main.java
 * Date  : 10/19/2023
 */
public class Main {
    public static void main(String[] args) {
        NumberManipulator calc = new NumberManipulator();

        System.out.println(calc.sumOfDigits(456));
        System.out.println(calc.reverseNumber(679));

        int[] reversed_number = calc.toArray(258);
        for (int i = 0; i < 3; ++i) {
            System.out.println(reversed_number[i]);
        }
    }
}