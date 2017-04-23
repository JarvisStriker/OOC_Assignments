import java.util.*;
public class ExceptionAtZeroNumber {

	public static void main(String[] args) {
		try
		{
			Random obj=new Random();
			int n=obj.nextInt(100);
			System.out.println("Number generated is: "+n);
			int res=100/(n%10); 	
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("\nNumber contains a zero");
		}
	}

}
