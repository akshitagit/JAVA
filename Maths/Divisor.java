public class Divisor {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        long num = scanner.nextInt(), i;
        System.out.print("Divisors of " + num + " = 1 , ");
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println(num);
        scanner.close();
    }
}
