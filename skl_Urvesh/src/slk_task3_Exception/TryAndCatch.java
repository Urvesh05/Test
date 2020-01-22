package slk_task3_Exception;

public class TryAndCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int i=50/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally{System.out.println("finally block is always executed");} 
		
		
		
	}

}
