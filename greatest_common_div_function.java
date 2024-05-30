public class greatest_common_div_function {
    public static void main(String[] args) {
        int number1 = 36;
        int number2 = 48;
        int gcd = calculateGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return calculateGCD(number2, number1 % number2);
    }
}
