import java.util.Scanner;

public class ArrayStatic {
	static int [] a;
	int n;
	void read()
	{  
    	Scanner read=new Scanner(System.in);
	    System.out.println("Enter the size of the array: ");
	    n=read.nextInt();
	    a=new int[n];
	    System.out.println("Enter the array contents: ");
	    for(int i=0;i<n;i++)
	    	a[i]=read.nextInt();   
    }
	void print()
    {
    	System.out.println("Array contents are: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
	public static void main(String[] args) {
		ArrayStatic obj = new ArrayStatic();
		obj.read();
		obj.print();

	}

}
