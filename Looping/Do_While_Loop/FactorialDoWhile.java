import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;
        int i = 1;

        if (n >= 1) {
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }

        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}
