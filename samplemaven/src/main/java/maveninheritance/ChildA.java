package maveninheritance;

public class ChildA extends HierarchyParent {
	public void display1()
	{
		System.out.println("This is the first child class");
	}

	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.display();
		obj.display1();

	}

}
