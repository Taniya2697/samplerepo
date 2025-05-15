package revision;

public class CreateException {

	public static void main(String[] args) throws VotingException {
		int age=5;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}

		else
		{
			throw new VotingException("Not eligible for voting");
		}
	}

}
