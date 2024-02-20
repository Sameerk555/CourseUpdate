package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer>s= new HashSet<>();
		
		s.add(22);
		s.add(33);
		s.add(45);
		s.add(11);
//		s.add(22);
		s.add(100);
		s.add(66);
		
//		System.out.println(s.size());
		s.remove(22);
		
		Iterator<Integer>itr= s.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		s.clear();
		System.out.println(s.size());

	}

}
