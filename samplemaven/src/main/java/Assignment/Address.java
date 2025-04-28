package Assignment;

public class Address {
	String address;
	Student ref;
	public Address(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}
	public void print()
	{
		System.out.println("The student name is "+ref.name+" and rollno is "+ref.rollno);
		System.out.println("Address of the student is :"+address);
	}

	public static void main(String[] args) {
		Student obj=new Student("Anvidh",4);
		Address obj1=new Address("Thozhuthumparambil House,Meladoor p.o",obj);
		obj1.print();

	}

}
