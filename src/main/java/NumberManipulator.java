public class NumberManipulator {
    static final int BASE_10_NUMERAL= 10;

    public int sumOfDigits(int number_input) {
        //validate that the passed number_1 is a valid 3-digit number.
        if(number_input<100 || number_input >999)
        {
            //return -1 if invalid for troubleshooting
            return -1;
        }

        int third_digit;
        third_digit = number_input%10;
        number_input -= third_digit;
        number_input /= BASE_10_NUMERAL;

        int second_digit;
        second_digit = number_input%10;
        number_input -= second_digit;
        number_input /= BASE_10_NUMERAL;

        int first_digit;
        first_digit = number_input%10;

        int sum_of_numbers;
        sum_of_numbers = first_digit + second_digit +third_digit;

        return sum_of_numbers;
    }

    public String reverseNumber(int number_input) {

        return null;
    }
}