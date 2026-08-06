import java.sql.SQLException;

public class ExceptionDemo4 {
	static void method3()throws SQLException {
		System.out.println("SQL exception may occur in method 3...");
	}
	static void method2() throws SQLException {
		method3();
	}
	static void method1() throws SQLException {
		method2();
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
