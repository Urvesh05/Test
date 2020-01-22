package slk_task1;

public class Encapsulation {

	//data hiding
	private String name;
	
	public void setName(String sname)
	{
		name=sname;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName("karan");
		System.out.println(encapsulation.getName());
		
	}

}
