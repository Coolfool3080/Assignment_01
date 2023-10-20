public class NumberManipulator {
    static final int BASE_10_NUMERAL= 10;

    public int sumOfDigits(int number_input) {
        //validate that the passed number_input is a valid 3-digit number.
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
        //validate that the passed number_input is a valid 3-digit number.
        if(number_input<100 || number_input >999)
        {
            //return Error message if invalid for troubleshooting
            return "Error: Invalid 3 digit number.";
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

        String reverse_number = null;
        reverse_number = String.format("%d%d%d", third_digit, second_digit, first_digit);

        return reverse_number;
    }

    public int[] toArray(int number_input) {
        //validate that the passed number_input is a valid 3-digit number.
        if(number_input<100 || number_input >999)
        {
            //return -1 if invalid for troubleshooting
            int[] Error_array = {-1};
            return Error_array;
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

        int[] array_of_numbers = {first_digit,second_digit,third_digit};
        return array_of_numbers;
    }
}