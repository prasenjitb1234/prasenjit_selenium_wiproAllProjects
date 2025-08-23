package File_Handling.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	int id;
	String name;
	
//	Employee(int id, String name){
//		this.id = id;
//		this.name = name;
//	}
	
	void setEmpDetails(int id, String name) {
		this.id = id;
	
		this.name = name;
		System.out.println("employee : "+this.toString());
	}

	@Override
	public String toString() {
		return id+" "+name;
	}
	
	
	
	
}
