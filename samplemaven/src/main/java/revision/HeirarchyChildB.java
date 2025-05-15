package revision;

public class HeirarchyChildB extends HierarchyParent {
	public void sub()
	{
		int sub=a-b;
		System.out.println("The sub is : "+sub);
	}

	public static void main(String[] args) {
		HeirarchyChildB obj=new HeirarchyChildB();
		obj.display();
		obj.sub();
		
	}

}
