import java.util.Scanner;

class ThreeArray {
    public static void main(String... args) {
		
        int[] a = {1,2,3,4,5,6};
        int[] b = {3,4,56,7,8,3};
        int[] c = new int[6];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Third array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(c[i]);
        }
    }
