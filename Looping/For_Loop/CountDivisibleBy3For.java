import java.util.Scanner;

public class CountDivisibleBy3For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
        sc.close();
    }
}
