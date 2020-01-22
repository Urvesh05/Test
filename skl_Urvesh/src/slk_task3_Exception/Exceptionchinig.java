package slk_task3_Exception;

public class Exceptionchinig {

	   void a()
	{
		  int i= 60/0;
		 // System.out.println("hello");
	}
	  void b()
	  {
		  a();
	  }
	
	 void c()
	
	{
		 
		try
		{
			b();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exceptionchinig.c();
		
		Exceptionchinig e=new Exceptionchinig();
		e.c();
	}

}
