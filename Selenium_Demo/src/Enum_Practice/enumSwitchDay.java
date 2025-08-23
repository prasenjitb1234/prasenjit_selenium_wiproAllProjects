package Enum_Practice;

enum Day{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}

public class enumSwitchDay {
	public static void main(String[] args) {
		
		Day d = Day.Thursday;
		
		switch(d) {
		case Monday:
			System.out.println("Its Monday Today");
			break;
			
		case Tuesday:
			System.out.println("Its Tuesday Today");
			break;
			
		case Wednesday:
			System.out.println("Its Wednesday Today");
			break;
			
		case Thursday:
			System.out.println("Its Thursday Today");
			break;
			
		case Friday:
			System.out.println("Its Friday Today");
			break;
		case Saturday:
			System.out.println("Its Saturday Today");
			break;
			
		}
		
		
		
	}
}
