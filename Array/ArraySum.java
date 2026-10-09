import java.util.Scanner;
class array {
	public static void main(String args[]){
		Scanner input_func = new Scanner(System.in);
		int c_array[] = new int[20];
		
		for (int i=0;i<3;i++){
			int a = input_func.nextInt();
			c_array[i]=a;
		}
		
		for (int i=0;i<20;i++){
			System.out.println(c_array[i]);
		}
		
		
	}
}