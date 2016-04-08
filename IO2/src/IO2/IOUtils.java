package IO2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOUtils {

	 static String ReadUnicodeText()
	{ 
		 String s="";
		try {
			FileReader fileReader =new FileReader("D:/Even.txt");
//			FileReader fileReader =new FileReader("D:/relate_3.txt");
//			FileReader fileReader =new FileReader("D:/SNT.txt");
			int len=0;
			char[] buffer= new char[1024];
			while((len = fileReader.read(buffer)) != -1  )
			{
				s+= new String(buffer,0,len);
			}
			System.out.println(s);
			fileReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}
