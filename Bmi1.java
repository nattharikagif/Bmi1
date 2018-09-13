	import java.util.*;
	class Bmi1{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
		System.out.print("ENTER HIGTH  = "); double h = sc.nextDouble()/100;
        System.out.print("ENTER WEIGHT  = "); double w = sc.nextDouble();
         double bmi =0;
         bmi = w/(h*h);
		 
		 System.out.println("Ans = "+bmi);
	
	} 

}