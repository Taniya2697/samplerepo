package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationParent ref;
	public AggregationChild(String city,String state,AggregationParent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+city+" "+state);
	}

	public static void main(String[] args) {
		AggregationParent obj=new AggregationParent("Taniya",30,"Meladoor");
		AggregationChild obj1=new AggregationChild ("chalakudy","Kerala",obj);
		obj1.display();

	}

}
