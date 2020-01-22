package slk_task1;

public class Object {
	//using reference
	int id;
	String name;
	
	//using method
	public void get(int a)
	{
		String s="rahul";
		System.out.println(a);
		System.out.println(s);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object object = new Object();
		object.id=10;//using reference
		object.name="Urvesh";
		
		System.out.println(object.id+object.name);
		object.get(5);
	}
}
