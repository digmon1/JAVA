import java.util.Scanner;

class ArrayReverse {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array in reverse:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}