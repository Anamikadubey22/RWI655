package june7;

public class CountVowels {
    public static void main(String[] args) {
        String inputString = "Preparation";
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String inputString) {
        int count = 0;
        // Convert the inputString to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
