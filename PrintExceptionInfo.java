package june11;

public class PrintExceptionInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100 , b=0 , c;
			c = a/b ;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}

}
