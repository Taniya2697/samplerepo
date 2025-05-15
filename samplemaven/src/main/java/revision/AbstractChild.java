package revision;

public class AbstractChild extends AbstractParent {
	public void print()
	{
		System.out.println("hiii");
	}

	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.print();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void show() {
		System.out.println("How are you?");
		
	}

}
