package Inheritance_Demo.Multilevel_Inheritance;


class SoftwareTesting{
	
	void Syllabus() {
		System.out.println("Software Testing course Details");
		System.out.println("Syllabus : Manual Testing, Core Java, Selenium WebDriver, Jira(Project Management), Mysql(Database)");
		System.out.println("fees : "+50000);
	}
}

class Manual extends SoftwareTesting{
	
	void manual_testing() {
		super.Syllabus();
		System.out.println("If it is manual Testing only \n then it includes Manual Testing Concepts, Jira, Mysql, Postman  ");
	}
	
	
	
}

class Automation extends SoftwareTesting{
	
	void automation_testing() {
		super.Syllabus();
		System.out.println("If it is Automation Testing only \n then it includes Core Java, Selenium Web Driver, Mysql, Jira , ");
	}
}




public class Java_Selenium {
	public static void main(String[] args) {
		
		System.out.println("Manual Testing Course Details : ");
		Manual mn = new Manual();
		mn.manual_testing();
		
		System.out.println("Automation Testing Course Details : ");
		Automation at = new Automation();
		at.automation_testing();
		
		
	}
}
