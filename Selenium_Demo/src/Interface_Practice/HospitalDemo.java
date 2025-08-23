package Interface_Practice;

interface Doctor {
	void operation();

	void OPD();

}

interface Nurse {
	void dailycheck();

	void documentation();

}

interface Accountant {
	void payment();

	void query();
}

class Patient implements Doctor, Nurse, Accountant {

	@Override
	public void payment() {

		System.out.println("Complete Payment to Access Further Process");

	}

	@Override
	public void query() {

		System.out.println("Ask for Any Inquiries ");
	}

	@Override
	public void dailycheck() {

		System.out.println("Go to Nurse for a Health Checkup ");
	}

	@Override
	public void documentation() {

		System.out.println("Take Reports/ documentation from Nurse ");

	}

	@Override
	public void operation() {
		System.out.println("Doctor will perform necessary operation ");

	}

	@Override
	public void OPD() {
		System.out.println("Attend meeting for consultation");

	}

}

public class HospitalDemo {
	public static void main(String[] args) {

		Patient p = new Patient();
		// nurse
		p.dailycheck();
		p.documentation();
		// doctor
		p.operation();
		p.OPD();
		// accountant
		p.payment();
		p.query();

	}
}
