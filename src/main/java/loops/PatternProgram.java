package loops;

public class PatternProgram {

    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for printing '+'
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("+");
            }

            // Inner loop for printing '-'
            for (int k = rows; k > rows - i - 2 ; k--) {
                System.out.print("-");
            }
            System.out.println();
  }

}

}