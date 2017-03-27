import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class StackJava {
	
	static int [] a;
	public static void queueImplementation(int size)
	{
		int rear=-1,n,front=0;
		a= new int[size];
		Scanner read = new Scanner(System.in);
		try
		{
		PrintWriter queue_file = new PrintWriter(new File("Queue.txt"));
		System.out.println("File Created! \n ");
		Thread.sleep(700);
		System.out.println("Generating random numbers...");	
		Random random = new Random(size);
		while(rear<size-1)
		{
		n=random.nextInt(size)+1;
		a[++rear]=n;
		queue_file.print(n);
		queue_file.print("\t");
		Thread.sleep(500);
		System.out.println("Value : "+n+" ,Inserted");
		}
		for(;;){
			System.out.println("\nWhat do you want to do? \n");
			System.out.println("Press '1' to display \nPress '2' to delete one element \n");
			int choice=read.nextInt();
			switch(choice)
			{
			case 1 : 
				if(front==size)
				{
					System.out.println("I got nothing to display! Bye :)");
					System.exit(0);
				}
				System.out.println();
				for(int i=front;i<size;i++)
					System.out.print(a[i]+"\t");
				break;
			case 2 :
				try 
				{
			      	 System.out.println("\nDeleted element : "+a[front++]);
			    }
				catch (Exception e) 
				{
			         System.out.println("Empty Queue");
			         System.exit(0);
				}
				break;
				default : System.out.println("Wrong input");
				System.out.println("\nPROGRAM TERMINATED!");
				
			}
			}
			}
			catch(Exception g)
			{
				System.out.println(g);
			}
		
	}
	public static void stackImplementation(int size)
	{
		int count=0,n;
		a= new int[size];
		Stack obj = new Stack();
		Scanner read = new Scanner(System.in);
		try
		{
		PrintWriter stack_file = new PrintWriter(new File("Stack.txt"));
		System.out.println("File Created! \n ");
		Thread.sleep(1500);
		System.out.println("Generating random numbers...");	
		Random random = new Random(size);
		while(count<size)
		{
		n=random.nextInt(size)+1;
		a[count]=n;
		stack_file.print(n);
		stack_file.print("\t");
		obj.push(new Integer(n));
		Thread.sleep(500);
		System.out.println("Value : "+n+" ,pushed");
		count++;
		}
		for(;;){
		System.out.println("\nWhat do you want to do? \n");
		System.out.println("Press '1' to display \nPress '2' to pop all the elements\nPress '3' to pop one element \n");
		int choice=read.nextInt();
		switch(choice)
		{
		case 1 : 
			if(obj.isEmpty())
			{
				System.out.println("I got nothing to display! Bye :)");
				System.exit(0);
			}
			System.out.print("Top->");
			for(int i=size-1;i>=0;i--)
				System.out.println("\t"+a[i]);
			break;
		case 2 :
			try 
			{
		       for(int i=size-1;i>=0;i--)
		       {
		      	 System.out.println("\nPopped element : "+(Integer)obj.pop());
		       }
		       System.exit(0);
		    }
			catch (Exception e) 
			{
		         System.out.println(e+"Empty Stack");
		         System.exit(0);
			}
			break;
		case 3 :
			try 
			{
		      	 System.out.println("\nPopped element : "+(Integer)obj.pop());
		      	 size--;
		    }
			catch (Exception e) 
			{
		         System.out.println(e);
		         System.exit(0);
			}
			break;
			default : System.out.println("Wrong input");
			System.out.println("\nPROGRAM TERMINATED!");
			
		}
		}
		}
		catch(Exception g)
		{
			System.out.println(g);
		}
		
		
	}

	public static void main(String[] args) {
		int elements;
		Scanner read = new Scanner(System.in);
		for(;;){
		System.out.println("Do you want to check out stack or queue?");
		System.out.println("S -> Stack \nQ -> Queue");
		char choice=read.next().charAt(0);
		if(choice=='S' || choice=='s')
		{
			System.out.print("Enter the number of elements you want to try out (1~1000) :");
			elements=read.nextInt();
			if(elements < 0)
				System.out.println("Seriously? Negative numbers??? TRY AGAIN! ");
			else if(elements > 1000)
				System.out.println("Sorry man! I think it's too much for me to handle. TRY AGAIN!");
			else if(elements == 0)
				System.out.println("What do you expect me to do? NOTHING? TRY AGAIN!"); 
			else
			{
				stackImplementation(elements);
				System.exit(0);
			}
		}
		else if(choice=='Q' || choice=='q')
		{
			System.out.print("Enter the number of elements you want to try out (1~1000) :");
			elements=read.nextInt();
			if(elements < 0)
				System.out.println("Seriously? Negative numbers??? TRY AGAIN! ");
			else if(elements > 1000)
				System.out.println("Sorry man! I think it's too much for me to handle. TRY AGAIN!");
			else if(elements == 0)
				System.out.println("What do you expect me to do? NOTHING? TRY AGAIN!"); 
			else
			{
				queueImplementation(elements);
				System.exit(0);
			}
			
		}
		else
			System.out.println("PLEASE FOLLOW THE INSTRUCTIONS :/ ");
		

		}

	}
}
