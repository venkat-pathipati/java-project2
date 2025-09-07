public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;  // number to reverse
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;    // get last digit
            reversed = reversed * 10 + digit; // add it to reversed
            number = number / 10;      // remove last digit
        }

        System.out.println("Reversed Number 1: " + reversed);
    }
}
