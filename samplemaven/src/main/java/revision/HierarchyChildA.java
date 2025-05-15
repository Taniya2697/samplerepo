package revision;

public class HierarchyChildA extends HierarchyParent {
	public void sum()
	{
		int sum=a+b;
		System.out.println("The sum is : "+sum);
	}

	public static void main(String[] args) {
		HierarchyChildA obj=new HierarchyChildA();
		obj.display();
		obj.sum();

	}

	}
