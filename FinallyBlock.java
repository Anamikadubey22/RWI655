package june11;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100 , b=0, c;
			c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : " + e);
		}
		finally {
			System.out.println("I am in finlly block . ");
		}
	}

}
