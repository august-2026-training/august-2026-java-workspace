
public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			ArithmeticException ae = new ArithmeticException("Demo for throw keyword");
			throw ae;
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
