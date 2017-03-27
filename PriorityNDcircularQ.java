import java.util.*;

public class PriorityNDcircularQ {

	int f=-1,x;
	int r=-1;
	int [] a;
	public void priorityQueueImplementation(int size) throws Exception
	{
		//Insert, Display and Delete
		Random random=new Random();
		a= new int [size];
		f=0;		 
		  for(int i=0;i<size;i++)
		  { 
			  x=random.nextInt(size);
			  p_insert(x,size);
		  }
		 p_display();
		 for(int i=0;i<size;i++)
			p_delete();
	}
	public void p_insert(int item, int size)
	{
		//ascending order
		if(r<size-1)
		{
			int pos=r;
			r=r+1;
			while(pos>=0 && a[pos]>=item)
			{
				a[pos+1]=a[pos];
				pos--;
			}
			a[pos+1]=item;
		}
		else 
			System.out.println("Queue is full");
	}
	public void p_delete()
	{
		if(f>r)
			System.out.println("Queue is empty");
		else 
			System.out.println(a[f++]+" is deleted");
	}
	public void p_display()
	{
		System.out.println("Queue contents :");
		for(int i=f;i<=r;i++)
			System.out.println(a[i]);
	}
	public void circularQueueImplementation(int size) throws Exception
	{
		//Insert, Display, Delete, Insert and Display
		Random random=new Random();
		a= new int [size];
		for(int i=0;i<size;i++)
		{ 
			x=random.nextInt(size);
			c_insert(x,size);
		}
		c_display(size);
		Thread.sleep(400);
		for(int i=0;i<size;i++)
			c_delete(size);
		Thread.sleep(400);
		for(int i=0;i<size;i++)
		{ 
			x=random.nextInt(size);
			c_insert(x,size);
		}
		c_display(size);
	}
	public void c_insert(int item, int size)
	{
		if(f!=(r+1)%size)
		{
			if(r==-1)
				f=0;
			r=(r+1)%size;
			a[r]=item;
		}
		else 
			System.out.println("Queue is full");
	}
	
	public void c_delete(int size)
	{
		if(f==-1)
			System.out.println("Queue is empty");
		else 
		{
			System.out.println(a[f]+" is deleted");
			if(f==r)
			{
				f=-1;
				r=-1;
			}
			else
				f=(f+1)%size;
		}
	}
	
	public void c_display(int size)
	{
	 System.out.println("Queue contents :");
	 if(f<=r)
		 for(int i=f;i<=r;i++)
			 System.out.println(a[i]);
	 else
	 {
		 for(int i=f;i<size;i++)
			 System.out.println(a[i]);
		 for(int i=0;i<=r;i++)
			 System.out.println(a[i]);
	 }
	}

 

	public static void main(String []args) throws Exception
	{
		PriorityNDcircularQ s=new PriorityNDcircularQ();
		Scanner read = new Scanner(System.in);
		int elements;
		
		for(;;){
		System.out.println("P -> Priority Queue \nC -> Circular Queue");
		char choice=read.next().charAt(0);
		if(choice=='C' || choice=='c')
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
				s.circularQueueImplementation(elements);
				System.exit(0);
			}
		}
		else if(choice=='P' || choice=='p')
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
				s.priorityQueueImplementation(elements);
				System.exit(0);
			}
		}
		else
			System.out.println("PLEASE FOLLOW THE INSTRUCTIONS :/ ");
		}
		
	}
}