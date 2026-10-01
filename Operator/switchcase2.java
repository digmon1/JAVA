//write a program to input any two number from the keyboard and calaculate airthemetic operation on given operators.

class switchcase2{
	public static void main(String... args){
		double a= Double.parseDouble (args [0]);
		char b=  args [1].charAt(0);
		double c= Double.parseDouble (args [2]);
		switch(b)
		{
			case '+': System.out.println(a+c);
			break;
			
			case '-': System.out.println(a-c);
			break;
			
			case '/': System.out.println(a/c);
			break;
			
			case '*': System.out.println(a*c);
			break;
		
			case '%': System.out.println(a%c);
			break;
			
			default : System.out.println("Enter a valid operators");
			break;
		}
	}
}