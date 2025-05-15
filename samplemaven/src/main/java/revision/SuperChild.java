package revision;

public class SuperChild extends SuperParent{
	public SuperChild(int x,int y)
	{
		super(5,6);
		int sub=x-y;
		System.out.println(sub);
		
		
	}

	public static void main(String[] args) {
		SuperChild obj=new SuperChild(10,5);

	}

}
