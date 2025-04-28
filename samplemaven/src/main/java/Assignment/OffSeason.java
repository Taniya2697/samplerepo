package Assignment;

public class OffSeason extends OnSeason{
public void discount(int price)
{
	super.discount(2000);
	int discount=15*(price/100);	
	System.out.println("The discount price for the customer on Off Season is: "+discount);
}
	public static void main(String[] args) {
		OffSeason obj=new OffSeason();
		obj.discount(2000);		

	}

}
