package slk_task3_Exception;

public class ThrowException {
	
	static void age(int age1)
	{
		if(age1<18)
		{
			throw new ArithmeticException("in valid");
			//System.out.println("valid");
		}
		else
		{
			System.out.println("ok");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(12);
	}

}
