package slk_task4_InnerClass;

//using abstract class
abstract class AnonymousClass {

	abstract void eat();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonymousClass anonymousClass = new AnonymousClass() {
			
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating");
				
			}
		};
		anonymousClass.eat();
	}

}
