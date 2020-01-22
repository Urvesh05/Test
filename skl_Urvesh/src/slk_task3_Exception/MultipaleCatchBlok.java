package slk_task3_Exception;

public class MultipaleCatchBlok {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int i=40/0;
			
			int arr[] =new int [4];
			arr[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar);
		}
	}

}
