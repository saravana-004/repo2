package exce;

public class CheckMailExaception {

	public static void main(String[] args) throws Exception,MailExaception{
		String a ="saro123@gmail.com";
		try {
			if(a.contains("@gmail.com")) {
				throw new MailExaception("its a mail id");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
