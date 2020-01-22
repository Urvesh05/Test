package slk_task4_InnerClass;


//using interface
public interface AnonymouseInterface {

	void eat();
	
}
 class Test
 {
	 
	public static void main(String[] args) {
		
		AnonymouseInterface anonymouseInterface = new AnonymouseInterface() {
			
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating ");
			}
		};
		anonymouseInterface.eat();		
	}
}
