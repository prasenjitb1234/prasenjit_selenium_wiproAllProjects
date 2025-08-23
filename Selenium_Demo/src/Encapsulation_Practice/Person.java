package Encapsulation_Practice;

class Person {
	
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void getName(String name) {
		System.out.println("Person Name : "+name);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.getName("Prasenjit Bhosale");
	}
	
}
