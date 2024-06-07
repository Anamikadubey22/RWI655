package june7;

public class FirstNonRepeatedChar {
    public static char firstNonRepeatedChar(String str) {
        // Assuming ASCII characters, create an array to store character frequencies
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        
        // If no non-repeated character is found, return '\0'
        return '\0';
    }
    
    public static void main(String[] args) {
        String str = "amarnath";
        char result = firstNonRepeatedChar(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("There is no non-repeated character in the string.");
        }
    }
}
