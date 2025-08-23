
package Enum_Practice;

interface Student {
	void studName();

	void city();
}

enum StudInfo implements Student {
	PRASENJIT {
		public void studName() {
			System.out.println("name : Prasenjit");
		}

		public void city() {
			System.out.println("city : Mumbai");
		}
	};
}

public class EnumInterfaceCheckDemo {
	public static void main(String[] args) {
		StudInfo s = StudInfo.PRASENJIT;
		s.studName();
		s.city();
	}
}
