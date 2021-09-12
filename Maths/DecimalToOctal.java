public class DecimalToOctal {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        final int decimalNumber = number;

        int octalNumber = 0;

        int multiplier = 1;

        while (number != 0) {
            octalNumber += (number % 8) * multiplier;
            number /= 8;
            multiplier *= 10;
        }
        
        System.out.println("Converted decimal number '" + decimalNumber
                + "' to octal number '" + octalNumber + "'");
    }
}
