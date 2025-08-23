package Type_Casting;

class Test {
	void show() {
		System.out.println("Hello");
	}
}

class Test1 extends Test {
	void display() {
		System.out.println("Welcome");
	}

	void show() {
		System.out.println("Howe are yor ? ");
	}
}

public class TestDemo {
	public static void main(String[] args) {

		Test t1 = new Test(); 
		t1.show();
		
		Test t = new Test1(); // upcasting
		t.show();
		
		Test1 tt = (Test1)t; // downcasting
		tt.display();
		tt.show();
		
		// already casted cannot be re-casted again .
		
	}
}
