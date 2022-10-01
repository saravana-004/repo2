package exce;

public class Numfor {
public static void main(String[] args) {
	try {																				
		String a = "sara";
		int b =Integer.parseInt(a);
		System.out.println(b);
	} catch (Exception e) {
	e.printStackTrace();	
	} finally {
		System.out.println("inavlid");
	}

}
}
