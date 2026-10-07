import java.util.Scanner;

public class ReverseNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int reverse = 0;

        do {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        } while (number != 0);

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reverse = " + reverse);
        sc.close();
    }
}
