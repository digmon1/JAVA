import java.util.Scanner;

public class EvenNumbersDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ending number: ");
        int n = sc.nextInt();

        int i = 2;
        if (n >= 2) {
            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= n);
        }

        sc.close();
    }
}
