package slk_task4_InnerClass;

public class StaticNastedClass {

	static int data=30;  
	  static class Inner{  
	   void msg()
	   {
		   System.out.println("data is "+data);
	   }  
	   
	   static void get()
	   {
		   System.out.println("static method call ");
	   }
	  }    
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticNastedClass.Inner in= new StaticNastedClass.Inner();
	in.msg();
	
	StaticNastedClass.Inner.get();
	}

}
