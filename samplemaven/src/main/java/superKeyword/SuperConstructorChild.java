package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild(String s)
	{
		super(6);
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild("This is child class constructor");

	}

}
