package programming;

public class CharacterCaseConverter {

    public String convertCase(String str) {
        StringBuilder convertedStr = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is lowercase
            if (Character.isLowerCase(c)) {
                // Convert lowercase to uppercase
                convertedStr.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                // Convert uppercase to lowercase
                convertedStr.append(Character.toLowerCase(c));
            } else {
                // Character is neither uppercase nor lowercase, keep it unchanged
                convertedStr.append(c);
            }
        }

        return convertedStr.toString();
    }
}