/*
	Taking input from keyboard
	1. using scanner class
	2. using Boardingreader class
	3. usinf command line argument
*/
import java.util.Scanner;
class ScannerExample1{
	public static void main(String... args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Frist value: ");
		
		int a =sc.nextInt();
		System.out.println("Enter Second value: ");
		int b =sc.nextInt();
		System.out.println("The sum of the number is:"+(a+b));
	}
}