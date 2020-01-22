package slk_task3_Exception;

public class NestedTryBlock {

	/**
	 * @param args
	 */
	 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int k=10;
		//try
		//{
			
			try
			{
				System.out.println("to divide");
				int b=39/0;
				try
				{
					
					int n=k;
					System.out.println(n);
					
					try
					
					{
						int a[]= new int[5];
						a[5]=1;
						
						
					}catch(ArrayIndexOutOfBoundsException arr)
					{
						System.out.println(arr);
					}
					
				}catch(NullPointerException n)
				{
					System.out.println(n);
				}
				
			}catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
			
		}//catch(Exception ee)
			//{
				////System.out.println(ee);
			//}
			//System.out.println("normal flow");
			
	}
		
