
	public class ExcInt {
	    public static void main(String args[])
	    {  
	        class1 obj=new class1();
	        obj.start();
	    }	    
	}
	class class2 extends Thread
	{  
	    public void run()
	    {

	        	Thread.currentThread().setName("Class2 thread");
	            System.out.print(Thread.currentThread().getName());
	            try
	            {
	                Thread.sleep(2000);
	            }
	            catch(InterruptedException e)
	            {
	                System.out.println(e);
	            }
	        
	    }
	}
	class class1 extends Thread
	{ 
	    public void run()
	    {
	    	Thread.currentThread().setName("Class1 thread");
	            System.out.println(Thread.currentThread().getName());
	            class2 t1=new class2();
	            
	            t1.start();
	            t1.interrupt();
	            
	    }
	}

