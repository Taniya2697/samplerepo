package revision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(5);
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(s);

	}

}
