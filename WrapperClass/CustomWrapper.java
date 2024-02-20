package WrapperClass;

public class CustomWrapper {
	
	public CustomWrapper(int i) {
		super();
		this.i = i;
	}

	int i;

	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	

}
