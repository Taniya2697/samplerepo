package InterfaceExample;

public class MultipleChild implements MultipleParent1,MultipleParent2,MultipleParent3{

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.show();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("Multiple Inheritance");
		
	}

	@Override
	public void show() {
		System.out.println("Hello");
		
	}

	@Override
	public void display() {
		System.out.println("world");
		
	}

}
