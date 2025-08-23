package This_Keyword;

// refere current class constructor using this keyword
public class Test1 {

	Test1(String name) {
		System.out.println(name);
	}

	Test1() {
		this("I am from Test1 Parameterized Constuctor");
		System.out.println("Welcome to my space");
	}

	public static void main(String[] args) {

		Test1 t = new Test1();

	}
}
