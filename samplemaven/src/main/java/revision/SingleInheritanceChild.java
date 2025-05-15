package revision;

public class SingleInheritanceChild extends SingleInheritanceParent{
	public void calc()
	{
		int sum=a+b;
		System.out.println("The sum of 2 number is : "+sum);
	}

	public static void main(String[] args) {
		SingleInheritanceChild obj=new SingleInheritanceChild();
		obj.calc();

	}

}
