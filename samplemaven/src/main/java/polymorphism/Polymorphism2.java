package polymorphism;

public class Polymorphism2 extends Polymorphism1 {
	public void display(int a,int b)
	{
		super.display(4,3);
		int c=a-b;
		System.out.println("The sum is : "+c);
	}
	public static void main(String[] args) {
		Polymorphism2 obj=new Polymorphism2();
		obj.display(5,3);
		

	}

}
