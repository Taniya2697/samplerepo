package revision;

public class MultilevelChild extends MultilevelParentChild {
	public void display2()
	{
		System.out.println("Geeks");
	}

	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.display1();
		obj.display2();
		


	}

}
