package string_demo;

public class String_Demo {
    public static void main(String[] args) {
        
        String st = "Hello";
        String st1 = "  "; // string with only spaces

        System.out.println(st.charAt(2));
        
        System.out.println(st.codePointAt(1)); // returns ASCII value / UniCode of char at index 1
        System.out.println(st.codePointBefore(2));
        
        System.out.println(st.equals("Hello"));
        System.out.println(st.equalsIgnoreCase("hello"));

        System.out.println(st1.isBlank()); // true → contains only whitespace (spaces, tabs, etc.)
        System.out.println(st1.isEmpty()); // false → not empty, contains 2 space characters
        
        System.out.println(st.lastIndexOf("o"));
        System.out.println(st.contains("lo"));
    }
}
