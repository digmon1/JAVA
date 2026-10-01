// Write a program to input any two numbers and find addition
// by using command line argument

class CommandLine1 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition is :" + (a + b));
    }
}