package sample;

import java.util.Scanner;

public class Calc { 
	
	public static void add(double b, double c)
	{
		
		double d=b+c;
		System.out.println("Addition="+d);
		
	}
	public static void sub(double b, double c)
	{
		
		double d=b-c;
		System.out.println("Subtraction="+d);
		
	}
	public static void mul(double b, double c)
	{
		
		double d=b*c;
		System.out.println("Multiplication="+d);
		
	}
	public static void div(double b, double c)
	{
		try{
		double d=b/c;
		System.out.println(" Division="+d);
		}catch(ArithmeticException e){
			System.out.println("number cant b divi by zero");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		double e= s.nextInt();
		double f= s.nextInt();
		System.out.println("Enter the Clac operation to be Done");
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. divi");
		
		int a= s.nextInt();
		switch (a)
		{
		case 1:
				
			add(e, f);
			break;
		case 2:
					
			sub(e, f);
			break;
		case 3:
		
			mul(e, f);
			break;
		case 4:
			div(e, f);
			break;
		
		default : System.out.println("invalid input");
			 
		}
		main(args);

}
}
