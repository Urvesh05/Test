package slk_task4_InnerClass;

//member inner Class
public class MmberInerClass {
	
		int i=10;
		private int n=20;
		static int c=30;
	
	class InnerClass
	{
		public void  sum()
		{
			System.out.println("Ans ="+i+n+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MmberInerClass.InnerClass outer = new MmberInerClass().new InnerClass();
		outer.sum();
		
	}

}
