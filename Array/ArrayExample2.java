// write a program to create three array insert data in any two array and store the sum of two array inside third array
import java.util.Scanner;

class  ArrayExample2{
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];
        int[] b = new int[6];
        int[] c = new int[6];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < 6; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Third array:");
        for (int i = 0; i < 6; i++) {
            System.out.println(c[i]);
        }
    }
}