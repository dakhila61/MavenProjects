package exceptions;

public class StringToIntConverter {

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertStringToInt(input);
                System.out.println("Input: " + input + ", Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + ", Exception: " + e.getMessage());
            }
        }
    }

    public static int convertStringToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}
