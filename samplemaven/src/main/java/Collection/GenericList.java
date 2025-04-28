package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		//List<String>s=new ArrayList<String>();//using List interface
		ArrayList <String>s=new ArrayList<String>();//using ArrayList class
		s.add("apple");
		s.add("orange");
		s.add("banana");
		s.add("Mango");
		System.out.println(s);
		System.out.println(s.get(3));
		s.set(3, "apple");
		System.out.println(s);
		System.out.println(s.indexOf("apple"));
		System.out.println(s.lastIndexOf("apple"));
		s.remove(3);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.contains("orange"));
		System.out.println(s.size());

	}

}
