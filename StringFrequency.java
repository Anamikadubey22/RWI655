package june7;
import java.util.*;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toLowerCase();
		
		//to count each letter frequency
		for(char c='a' ; c <= 'z' ; c++) {
			int count = 0;
			//to traverse the string 
			for(int i=0; i< str.length() ; i++) {
				if(c == str.charAt(i)) {
					count++;
				}
			}
			System.out.println(c + "\t" + count);
		}
	}

}
