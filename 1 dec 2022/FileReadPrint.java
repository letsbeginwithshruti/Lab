package fileReaderWriter;

//Question no 2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileReadPrint {
	FileReadPrint r=new FileReadPrint();	
	public static void main(String[]args) {
		int n=100;
		for(int i=1;i<=n;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for write and 2 for read");
		int a=sc.nextInt();
		try {
			//if(i==2)  {
			//	System.out.println(" File is empty");
				//break;
			//}
			if(a==1) {
				FileOutputStream f= new FileOutputStream("D:\\test.txt");
				String s="Hi, welcome to java world";
				byte b[]=s.getBytes();  //changing string to byte array
				f.write(b);  //write() is used to write in file
				f.close();
			}else if(a==2) {
				FileInputStream f=new FileInputStream("D:\\test.txt");

				int i1=0;
				while((i1=f.read())!=-1) {
					System.out.print((char)i1);
				}
				f.close();
			}else {
				System.out.println("Invalid input");
				break;
			}
			System.out.println("\n Done");
		}catch(Exception e) {
		System.out.println(e);	
		} } }}