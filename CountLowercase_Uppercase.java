package june7;

public class CountLowercase_Uppercase {
    public static void main(String[] args) {
        String inputString = "I love java Programming";
        int[] count = countLowerUpper(inputString);
        System.out.println("Lowercase letters: " + count[0]);
        System.out.println("Uppercase letters: " + count[1]);
    }

    public static int[] countLowerUpper(String inputString) {
        int[] count = new int[2]; // 0th index for lowercase, 1st index for uppercase
        for (char c : inputString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count[0]++;
            } else if (Character.isUpperCase(c)) {
                count[1]++;
            }
        }
        return count;
    }
}
