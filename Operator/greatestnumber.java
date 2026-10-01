// Write a program to take three numbers and find the greatest number

class GreatestNumber {
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if ((a > b) && (a > c)) {
            System.out.println(a + " is greater than b and c");
        } else if ((b > a) && (b > c)) {
            System.out.println(b + " is greater than a and c");
        } else {
            System.out.println(c + " is greater than b and a");
        }
    }
}