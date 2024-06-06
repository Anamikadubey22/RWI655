package june6;

public class StrinMethod {
    public static void main(String[] args) {
        String str = new String("Anamika");
        System.out.println(str);

        str = str.concat("Dubey"); // concatenate
        System.out.println(str);

        char ch = str.charAt(1); // gives character at index 1
        System.out.println("Character at index 1: " + ch);

        int len = str.length(); // gives length
        System.out.println("Length of the string: " + len);

        String substr1 = str.substring(2); // gives string from index 2 to end
        String substr2 = str.substring(1, 4); // gives string from index 1 to 3 (exclusive)
        System.out.println("Substring from index 2: " + substr1);
        System.out.println("Substring from index 1 to 3: " + substr2);

        String str2 = "Hello";
        boolean isEqual = str.equals(str2); // false
        System.out.println("Are the strings equal? " + isEqual);

        String lowerStr = str.toLowerCase();
        String upperStr = str.toUpperCase();
        System.out.println("Lowercase string: " + lowerStr);
        System.out.println("Uppercase string: " + upperStr);

        String trimmedStr = str.trim(); // remove spaces from start and end
        System.out.println("Trimmed string: " + trimmedStr);

        String replacedStr1 = str.replace('u', 'p');
        String replacedStr2 = str.replace("b", "c");
        System.out.println("Replaced 'u' with 'p': " + replacedStr1);
        System.out.println("Replaced 'b' with 'c': " + replacedStr2);
    }
}