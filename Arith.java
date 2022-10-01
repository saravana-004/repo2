package exce;

public class Arith {

	public static void main(String[] args) {
	try {
		int a =10;
		int b =0;
		int divi=a/b;
		System.out.println(divi);
	} catch(Exception e) {
		e.printStackTrace(); 
	}finally {
		System.out.println("Invalid");
	}
	

	}

}
