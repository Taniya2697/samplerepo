package abstraction;

public class AbstractChild extends AbstractionParent{
	public void print()
	{
		System.out.println("Child class");
	}
	

	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		AbstractionParent obj1=new AbstractChild();//reference creation
		obj.display();
		obj.print();
		obj.show();

	}


	@Override
	public void display() {
		System.out.println("Helloworld");
		
	}


	@Override
	public void show() {
		System.out.println("Hello");
		
	}

}
