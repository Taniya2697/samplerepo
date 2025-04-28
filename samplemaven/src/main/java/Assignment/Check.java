package Assignment;

public class Check extends Sum {

	void display()
	{
		super.total();
		int result=0;
		result=c%10;
	 	if(result==0)
	 	{
	 	System.out.println("The sum of given numbers is divisible by 10");
	 	}
	 	else
	 	{
	 	System.out.println("The sum of given numbers is not divisible by 10");
	 	}
	 	
	}

	public static void main(String[] args) {
		Check obj=new Check();
		obj.display();

	}

}
