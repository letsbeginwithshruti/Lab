/*Q. 2
Write a Java program to find sequences of
 lowercase letters joined with aunderscore.*/

package string;

public class Sequence {
	public static void main(String[] args) {
		String s="Java_program";
		boolean b=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='_') {
				char c=s.charAt(i+1);
			
				if(Character.isLowerCase(c)) {
				b=true;
				break;}		
		}
	} if(b)
		System.out.println("matched");
	else
		System.out.println("not matched");
		}
	}


