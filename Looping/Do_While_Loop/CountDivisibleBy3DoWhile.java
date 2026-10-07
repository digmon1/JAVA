import java.util.Scanner;

public class CountDivisibleBy3DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        if (n >= 1) {
            do {
                if (i % 3 == 0) {
                    count++;
                }
                i++;
            } while (i <= n);
        }

        System.out.println("Count = " + count);
        sc.close();
    }
}
