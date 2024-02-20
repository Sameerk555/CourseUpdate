package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer>s= new TreeSet<>();
		
		s.add(22);
		s.add(33);
		s.add(45);
		s.add(11);
		s.add(22);
		s.add(100);
		s.add(66);
		
		Iterator<Integer>itr= s.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}


	}

}
