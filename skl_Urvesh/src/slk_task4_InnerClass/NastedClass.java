package slk_task4_InnerClass;

import slk_task4_InnerClass.NastedClass.Address;

public class NastedClass {
	
	private int i=19;
		class Address
		{
			public  void get()
			{
				System.out.println(i);
			}
		} Address a= new Address();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NastedClass n = new NastedClass();
		
		NastedClass.Address npa =  n.new Address();
          
		npa.get();
	}
}
