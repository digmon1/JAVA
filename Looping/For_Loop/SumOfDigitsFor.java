import java.util.Scanner;

public class SumOfDigitsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int sum = 0;

        for (; number != 0; number /= 10) {
            sum += number % 10;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
