package revision;

public class AggregationAddress {
	String address;
	AggregationStudent ref;
	public AggregationAddress(String address,AggregationStudent ref)
	{
		this.address=address;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+address);
	}

	public static void main(String[] args) {
		AggregationStudent obj=new AggregationStudent("Taniya",30);
		AggregationAddress obj1=new AggregationAddress("Chalakudy",obj);
		obj1.display();
		

	}

}
