package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String>s=new HashSet<String>();
		s.add("black");
		s.add("blue");
		s.add("green");
		Set<String>s1=new HashSet<String>();
		s1.add("red");
		s1.add("yellow");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
        System.out.println(s.contains("yellow"));
        System.out.println(s.containsAll(s1));
        System.out.println(s1.containsAll(s));
        System.out.println(s.isEmpty());
        s.removeAll(s1);
        System.out.println(s);
        System.out.println(s.size());
        s1.clear();
        System.out.println(s1);
       
	}

}
