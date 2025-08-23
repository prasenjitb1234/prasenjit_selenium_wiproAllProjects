package Pass_Value_Reference;

public class Pass_By_Value {
	
	String name = "ClassTest";
	
	void show(String name1) {
		name = name1;
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		
		Pass_By_Value obj = new Pass_By_Value();
		
		System.out.println(obj.name); // Call By Value
		
		obj.show("MethodTest"); // Call By Reference
		
	}
}
