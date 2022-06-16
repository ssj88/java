import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
 class file2{
 	public static void main(String[] args) {
 		try{
 			int data;
 		File f1=new File("list.txt");
 		FileWriter even=new FileWriter("even.txt");
 		FileWriter odd=new FileWriter("odd.txt");
 		Scanner sn=new Scanner(f1);
	 		while(sn.hasNextLine())
	 		{
	 			 data = sn.nextInt();
	 			 if(data%2==0)
	 			 {
	 			 	even.write(String.valueOf(data));
					even.write(" ");
	 			 }
	 			 else{
	 			 	odd.write(String.valueOf(data));
					odd.write(" ");
	 			 
	 			 }
	 			
	 		}
	 			even.close();
	 			odd.close();
		}
 		catch(Exception e){
 			System.out.println(e);
 		}
 		
 	}
 }