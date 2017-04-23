import java.util.Scanner;

class ReadNames 
{
	Scanner read=new Scanner(System.in);
	public String [] names; 
	public String temp;
	int n,i;
	ReadNames()
	{
		try{
		System.out.println("Enter number of names: ");
		n=read.nextInt();
		names=new String[n];
		System.out.println("Enter names: ");
		for(i=0;i<n;i++)
			names[i]=read.next();}
		catch(Exception e){
			System.out.println(e);
			System.exit(0);}
			
	}
}
class Sort extends ReadNames
{
	 Sort()
	 {
	      for(i=0;i<n;i++)
		       for(int j=i+1;j<n;j++)
		           if(names[i].compareTo(names[j])>0)
		           {
		               temp=names[i];
		               names[i]=names[j];
		               names[j]=temp;                
		           }
	   System.out.println("Sorted names list: ");
	   for(int i=0;i<n;i++)
	            System.out.println(names[i]);
	  }
}
class Repeat extends Sort
{
	  Repeat()
	  {
		  System.out.println();
	      for(i=0;i<n;i++)
	          for(int j=i+1;j<n;j++)
	        	  if(names[i].equals(names[j]))
	        		  System.out.println(names[i]+" is repeated");    
	  }
 }

public class RepeatedNames
{
	public static void main(String[] args) 
	{
	     new Repeat();
    }
}