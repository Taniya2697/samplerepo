package superKeyword;

public class SuperVariableChild extends  SuperVariable{
String s="Red";
public void display()
{
	System.out.println(s);
	System.out.println(super.s); //used to refer immediate parent class instance variable
}
	public static void main(String[] args) {
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();

	}

}
