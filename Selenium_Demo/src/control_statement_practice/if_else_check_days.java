package control_statement_practice;

// Print "weekday" if the day is mon, tue, wed, thu, or fri
// Else print "weekend"

public class if_else_check_days {

    public static void main(String[] args) {
        
        String day = "mon";  

        if (day.equals("mon") || day.equals("tue") || day.equals("wed") ||
            day.equals("thu") || day.equals("fri")) {
            System.out.println("weekday");
        } else {
            System.out.println("weekend");
        }
    }
}
