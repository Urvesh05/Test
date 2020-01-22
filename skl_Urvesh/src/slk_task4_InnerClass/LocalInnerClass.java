package slk_task4_InnerClass;


//method inside class create (declared)
public class LocalInnerClass {
	
	private int data = 10;
	
	void dispaly()//method
	{
		System.out.println("outer class");
		final int value= 50;
		class Local//method ni under 6e.tene local innre class kahe 6e.
		{
			void msg()
			{
				System.out.println(value);
			}
			
		}
		Local local = new Local();
		local.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.dispaly();
	}

}
