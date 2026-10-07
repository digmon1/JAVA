import java.util.Scanner;

public class PrimeNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = n >= 2;
        int i = 2;

        if (prime) {
            do {
                if (n % i == 0 && i != n) {
                    prime = false;
                }
                i++;
            } while (i * i <= n && prime);
        }

        if (prime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }

        sc.close();
    }
}
