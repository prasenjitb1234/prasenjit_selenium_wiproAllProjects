package Inheritance_Demo.Multilevel_Inheritance;

class Hospital {

	void location(String location) {
		System.out.println("Location is : " + location);
	}

}

class Doctor extends Hospital {

	void DoctorInfo(String name, int id) {
		System.out.println("Doctor name is : " + name + " And Doctor id is : " + id);
	}

}

class Gynac extends Doctor{
	
	void treatPatient(String treats) {
		System.out.println("Task : "+treats);
	}
}

class Endo extends Doctor{
	void treatPatient(String treats) {
		System.out.println("Takes care of older people and diabetees");
	}
}



class Nurse extends Hospital{
	
	void NurseInfo(String name, int id){
		System.out.println("Nurse Name is : "+name +" and Nurse Id is : "+id);
	}
	
	void assist(String task) {
		System.out.println("Help Doctor : "+task);
	}
}






class Accountant extends Hospital{
	void AccountantInfo(String name) {
		System.out.println("Account Name : "+name);
	}
	
	void task(String work) {
		System.out.println("manage all expenses");
	}
	
}

class Payments extends Accountant{
	void paymentDetails(String PaymentInfo) {
		System.out.println("Payment info is : "+PaymentInfo);
	}
}

class Documentation extends Accountant{
	void documentDetails(String docInfo) {
		System.out.println("Document info is : "+docInfo);
	}
}

public class Hospital_Demo {
	public static void main(String[] args) {
		
		System.out.println("********Gynac : ***********");
		Gynac gc = new Gynac();
		gc.DoctorInfo("Tony Stark", 101);
		gc.location("Mumbai");
		gc.treatPatient("Takes care of women");
		
		System.out.println("********Payment : ***********");
		
		Payments pt = new Payments();
		pt.AccountantInfo("Peter Parker");
		pt.location("Mumbai");
		pt.paymentDetails("Paid some money ... ");
		pt.task("Calculate ...money or stuff ");
		
	}
}
