package june6;

public class ReverseString {

	public String reverseString(String str) {
	    StringBuilder sb = new StringBuilder(str);
	    return sb.reverse().toString();
	}

	 public static void main(String[] args) {
	        String str = "Railworld traniee";
	        ReverseString reverseString = new ReverseString();
	        String reversedStr = reverseString.reverseString(str);
	        System.out.println(reversedStr); // Output: !dlroW ,olleH
	    }
}
