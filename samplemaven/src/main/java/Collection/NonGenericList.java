package Collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List s=new ArrayList();
		s.add("red");
		s.add('c');
		s.add(1);
		s.add(5.99f);
		System.out.println(s);

	}

}
