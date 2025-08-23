package This_Keyword;

public class Test {
	
	void setName(String name) {
		System.out.println(name);
	}
	
	void getName() {
		this.setName("Prasenjit Bhosale");
		System.out.println("Welcome to Java Learning Session");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.getName();
		
		
		
		
	}
}
