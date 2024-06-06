package june6;

public class Immutablestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Anamika");   
		s1.concat("dubey");
		s1 = s1.concat("Dubey");
		System.out.println(s1);
	}
}
