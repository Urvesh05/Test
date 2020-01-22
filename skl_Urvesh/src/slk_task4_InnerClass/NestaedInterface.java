package slk_task4_InnerClass;

import slk_task4_InnerClass.NestaedInterface.Messege;

//interface within Interface
interface NestaedInterface {

	void show();
	private interface Messege
	 {
		 void msg();
	 }
}
	 class  Test1 implements NestaedInterface.Messege
	 {

		public void msg() {
			// TODO Auto-generated method stub
			System.out.println("Nasted Interfece");
		}
		public static void main(String[] args) {
			NestaedInterface.Messege messege = new Test1();
			messege.msg();
		}
	 }