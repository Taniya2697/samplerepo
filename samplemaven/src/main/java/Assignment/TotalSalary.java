package Assignment;

public class TotalSalary extends Calculate {
	public void totalcalc()
	{
	int totalsalary=bp+hra-pf-ded+bonus;
	System.out.println();
	System.out.println("THE SALARY SLIP OF EMPLOYEE");
	System.out.println("---------------------------");
	System.out.println("Basic Pay            : "+bp);
	System.out.println("Deduction            : "+ded);
	System.out.println("PF                   : "+pf);
	System.out.println("Bonus                : "+bonus);
	System.out.println("Total Salary by hand : "+totalsalary);
    }

	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.calculate();
		obj.totalcalc();
		

	}

}
