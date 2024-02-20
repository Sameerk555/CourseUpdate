package Implementations;

public class ArrayListTest {

	public static void main(String[] args) {
		MyArrayList<Integer>l= new MyArrayList<>();
		
		l.add(4);
		l.add(23);
		l.add(11);
		l.add(45);
		
		System.out.println(l.get(2));
		
		l.remove(2);
		System.out.println(l.get(2));
		
		System.out.println(l.getSize());

	}

}
