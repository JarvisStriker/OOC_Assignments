import java.util.Scanner;
public class Exc {

	public static void main(String[] args) {
		int n,x=10,temp;
		
		System.out.println("Enter the number : ");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		try
		{
			while(n>0)
			{
				temp=n%x;
				if(temp==0)
					throw new ArithmeticException("Zero Found");
				//temp=n/temp;
				n/=10;
			}
			System.out.println("Nothing to worry about");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}

}
