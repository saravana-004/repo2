package exce;

public class Nullexp {
	public static void main(String[] args) {
		try {
			String a =null;
			System.out.println(a.toUpperCase());
		} catch(Exception n) {
			n.printStackTrace();
		} finally {
			System.out.println("invalid");
		}

	}

}
