package revision;

public class PolymorphismChild extends PolymorphismParent{
	public void calc(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is :"+sum);
	}

	public static void main(String[] args) {
		PolymorphismChild obj=new PolymorphismChild();
		obj.calc(4, 4);
		PolymorphismParent obj1=new PolymorphismParent();
		obj1.calc(3, 9);

	}

}
