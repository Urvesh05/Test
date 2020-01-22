package slk_task3_Exception;

import java.io.IOError;
import java.io.IOException;

public class ThrowsEception {

	void get()throws IOException
	{
		throw new IOException("hadel");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try
		{
			ThrowsEception throwsEception = new ThrowsEception();
			throwsEception.get();
			
		}catch(Exception e)
		
		{
			System.out.println(e);
		}
		System.out.println("normal flow");
	}

}
