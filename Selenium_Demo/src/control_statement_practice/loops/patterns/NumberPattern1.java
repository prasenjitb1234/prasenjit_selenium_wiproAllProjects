package control_statement_practice.loops.patterns;

public class NumberPattern1 {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {
            int num = 1;

            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);  // Pascal's Triangle logic
            }

            System.out.println();
        }
    }
}
