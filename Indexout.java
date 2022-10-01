package exce;

public class Indexout {

	public static void main(String[] args) {
			
		try {
			String a  ="saraar";
		System.out.println(a.charAt(8));	
			} catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("invalid");
		}
		}
	}

	


