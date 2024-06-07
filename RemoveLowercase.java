package june7;

public class RemoveLowercase {
    public static void main(String[] args) {
        String inputString = "SubconciousMind";
        String stringWithoutLowercase = removeLowercase(inputString);
        System.out.println("String without lowercase letters: " + stringWithoutLowercase);
    }

    public static String removeLowercase(String inputString) {
        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
