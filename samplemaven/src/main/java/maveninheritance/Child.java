package maveninheritance;

public class Child extends ParentB {
	public void display2()
	{
		System.out.println("This the child class");
	
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.display1();
		obj.display2();
		
	

	}

}
