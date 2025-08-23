package Exception_Practice;

public class Throw_Exception {
	public static void main(String[] args) {
		
		String name = null;
//		String name = "Prasejit";
		if(name == null) {
			throw new NullPointerException("Name is not Null");
		}
		System.out.println(name.length());
		
		
		
		
	}
}
