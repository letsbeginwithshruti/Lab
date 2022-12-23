package fileReaderWriter;
//Q....3
import java.io.FileInputStream;

import java.io.IOException;
public class ReadByteArray 
{
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("D:\\test.txt");
			byte filout[]=new byte[1024];
			int i=0;
			while((i=fin.read(filout))>0) {
				System.out.println(new String(filout,0,i)); }
		}catch(Exception e) {
			System.out.println(e);
		} }
}