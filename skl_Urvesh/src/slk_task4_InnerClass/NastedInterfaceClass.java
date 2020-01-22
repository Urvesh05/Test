package slk_task4_InnerClass;

public class NastedInterfaceClass {

	interface Messege
	{
		void msg();
	}
}

 class Test4 implements NastedInterfaceClass.Messege

{

	public void msg() {
		System.out.println("Hello Naseted Interface");
	}
	public static void main(String[] args) {
		NastedInterfaceClass.Messege messege = new Test4();
		messege.msg();
		
	}
	
}
