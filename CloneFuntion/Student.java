package CloneFuntion;

public class Student implements Cloneable {
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
