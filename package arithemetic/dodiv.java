package domath;
import java.util.Scanner;
public class dodiv implements docal{
	int a,b;
	Scanner sn=new Scanner(System.in);
	public void calculate(){
		System.out.println("Enter a and b:");
		a=sn.nextInt();
		b=sn.nextInt();
		try{
		System.out.println("Quotient is:"+(a/b));
			 }
		catch(ArithmeticException e)
		{
System.out.println("Can not Divide by zero!!");
		}

	
}
}