class String1{
	public static void main(String... args){
		String s1 = "Sanjay";
		String s2 = "Sanjay";
		String s3 = " LBEF";
		
		String s4 = new String (" Sanjay");
		String s5 = new String (" Sanjay");
		String s6 = new String (" College");
		String s7 = new String (" LBEF");
		System.out.println(s1==s2);// Address comparasion
		System.out.println("s1 equals s2"+ s1.equals(s2)); // Content 
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
	}
}