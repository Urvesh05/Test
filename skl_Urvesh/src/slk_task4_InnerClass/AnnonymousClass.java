package slk_task4_InnerClass;


//using class
public class AnnonymousClass {

	public void eat()
	{
		System.out.println( "it is eating");
	}
	/**
	 * @param args
	 */
}
	class Food
	{
		public static void main(String[] args) {
			
		
		AnonymouseInterface anonymouseInterface = new AnonymouseInterface() {
			
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating pizza");
			}
		};
		anonymouseInterface.eat();
	}}