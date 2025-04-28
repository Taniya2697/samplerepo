package InterfaceExample;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		Interface1 obj1=new Interface2();//referance creation
		obj.display();
		obj.show();
		

	}

	@Override
	public void display() {
		System.out.println("This is an inteface program");
		
	}

	@Override
	public void show() {
		System.out.println("Interface");
		
	}

}
