package exam;

public class EncapParent {
	private String name;
	private int rollno;
	public void set(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public void get()
	{
		System.out.println("The name is : "+name);
        System.out.println("The rollno is :"+rollno);
	}

}
