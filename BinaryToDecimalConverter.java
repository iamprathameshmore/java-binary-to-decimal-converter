public class BinaryToDecimalConverter {
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binaryNumber = "101010";
        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        System.out.println("Decimal equivalent of " + binaryNumber + " is " + decimalNumber);
    }
}