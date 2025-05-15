package revision;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		//add()
		s.add(1);
		s.add(3);
		s.add(5);
		Set<Integer>s1=new HashSet<Integer>();
		s1.add(2);
		s1.add(4);
		s1.add(6);
		//addAll()
		s.addAll(s1);
		System.out.println(s);
		//contains
		System.out.println(s.contains(1));
		//Containsall()
		System.out.println(s.containsAll(s1));
		s.remove(5);
		System.out.println(s);
		s1.removeAll(s1);
		System.out.println(s1);
		System.out.println(s.isEmpty());
	    s.clear();
	    System.out.println(s);

	}

}
