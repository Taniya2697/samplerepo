package exam;

public class OverridingChild extends OverridingParent{
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum is: "+sum);
	}

	public static void main(String[] args) {
		OverridingParent obj=new OverridingParent();
		obj.sum(5, 6);
		OverridingChild obj1=new OverridingChild();
		obj1.sum(4, 4);
		

	}

}
