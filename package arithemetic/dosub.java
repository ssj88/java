package domath;
import java.util.Scanner;
public class dosub implements docal{
	int a,b;
	Scanner sn=new Scanner(System.in);
	public void calculate(){
		System.out.println("Enter a and b:");
		a=sn.nextInt();
		b=sn.nextInt();
		System.out.println("Differenc is:"+(a-b));
	}
}