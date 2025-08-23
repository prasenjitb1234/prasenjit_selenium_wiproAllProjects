package Exception_Practice;

public class ExceptionDemo_More {
	public static void main(String[] args) {
		
		
		//  NullPointerException
        try {
//        	String name = "Prasenjit";
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println( e);
        }
		
		
     // NumberFormatException
        try {
            String a = "a";
            int num = Integer.parseInt(a); 
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
		
		//classcast , classnotfound,illegalargumentException , interrupted etc. exceptions we need to implement
		
		
        
        
	}
}
