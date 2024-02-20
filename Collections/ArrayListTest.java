package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer>l= new ArrayList<>();
		
		l.add(5);
		l.add(9);
		l.add(2);
		l.add(25);
		l.add(11);
		
//	
		
		List<Integer>l1= new ArrayList<>();
		
		l1.add(33);
		l1.add(11);
		l1.add(22);
		l.addAll(l1);
		Collections.sort(l);
		
//		l.removeAll(l1);
//		l.retainAll(l1);
//		
//		l.clear();
//		System.out.println(l.size());
//		System.out.println(l.isEmpty());
//		int a= l.get(0);
		
//		Iterator<Integer> itr= l.iterator();
		
		
		
//		System.out.println(l.contains(35));
		
//		System.out.println(l.indexOf(22));
//		System.out.println(l.lastIndexOf(11));
		
//		l.removeIf(a->a%2==0);
		
		List<Integer> l3= l.subList(0, 3);
		
		
//       while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
		
		l3.add(0, 24);
		for(int a: l3) {
			System.out.println(a);
		}
		
	
	}

}
