package Enum_Practice;

enum Days {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

public class EnumConditionalDay {
    public static void main(String[] args) {

        Days d = Days.Monday;

        if (d == Days.Monday || d == Days.Tuesday || d == Days.Wednesday ||
            d == Days.Thursday || d == Days.Friday) {
            System.out.println("It's a Weekday");
        } 
        
        else if (d == Days.Saturday || d == Days.Sunday) 
        {
            System.out.println("It's a Weekend");
        }
    }
}
