- ;package exce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatch {

	public static void main(String[] args)throws                                                                                 n
	try {
		File f = new File("C:\\Users\\HP\\Downloads\\name.text");
		FileReader fr =new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)temp);
		}
		}catch (Exception i) {
			System.out.println(i);
		}
				}

	}


