public class ReverseDigit {
    public static void main(String[] args) {
        int no = 5432;
        int reverse = 0;
        while(no != 0) {
            int digit = no % 10;
            reverse = reverse * 10 + digit;
            no = no / 10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
