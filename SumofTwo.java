package first;
import java.util.*;
public class sumoftwo {
	public static void main(String []args)
	{
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Enter an integer1: "); 
	int number1=scanner.nextInt();
	System.out.print("Enter an integer2: "); 
	int number2=scanner.nextInt();
	int sum=number1+number2;
	System.out.println("--------------------------------");
	System.out.println("The sum of two integer is:"+sum);
	System.out.println("--------------------------------");
	}
}
