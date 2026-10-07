import java.util.Scanner;

public class PrintNumbersDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ending number: ");
        int n = sc.nextInt();

        int i = 1;
        if (n >= 1) {
            do {
                System.out.print(i + " ");
                i++;
            } while (i <= n);
        }

        sc.close();
    }
}
