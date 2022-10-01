package exce;

public class CheckAgeException {

	public static void main(String[] args)throws Exception,AgeException {
		int a=20;
		try {
			if(a>=18){
				throw new AgeException("eligible to vote");
			}
		}catch(Exception e) {
			  e.printStackTrace();
		}

	}

}
