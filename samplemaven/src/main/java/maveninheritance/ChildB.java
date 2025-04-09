package maveninheritance;

public class ChildB extends HierarchyParent{
	public void display2()
	{
		System.out.println("This is the second child class");
	}

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.display();
		obj.display2();

	}

}
