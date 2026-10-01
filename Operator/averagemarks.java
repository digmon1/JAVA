//write a program to input any marks to calculate the average marks and display the result
//avg >= 80 distinction

class averagemarks{
		 public static void main(String... args) {
        double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = Double.parseDouble(args[3]);
		double e = Double.parseDouble(args[4]);
		
		double avg =(a+b+c+d+e)/5;
		System.out.println("Avegrage number is:"+ avg);
		


        if (avg>=80) {
            System.out.println("Distinction");
        } else if (avg>=60) {
            System.out.println("First Division");
        }else if (avg>=50) {
            System.out.println("Second Division");
        }else if (a>=40) {
            System.out.println("Third Divsion");
		}else{
            System.out.println("Error");
		}
    }
}
