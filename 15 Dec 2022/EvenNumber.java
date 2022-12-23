//Problem Statement 1:
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumber
{
	List<Integer> a1=new ArrayList<Integer>(); 
		void storeEvenNumbers(int n) {
			for(int i =2; i<n ; i+=2) { 
				if(a1.add(i))  {
				System.out.println(i);  }
		}
	}
		void printEvenNumbers() {
			Iterator <Integer>it =a1.iterator();
			while(it.hasNext()) {
				System.out.println((it.next())*2); 
			}
			List<Integer> a2=new ArrayList<Integer>(); //creating array list 2
			a2.addAll(a1);  //all list 1 elements will be added in list 2
			System.out.println("A1 List Added to A2 List : "+a2);
		}
		public void retrieveEvenNumber(int n) {
			if(a1.contains(n)) { 
				System.out.println(n+" is present");
			}else 
					System.out.println(0); 
			} 
		public static void main(String[] args) {
			EvenNumber enl= new EvenNumber(); 
			System.out.println("Stored Even Numbers are : ");
			enl.storeEvenNumbers(20);
			System.out.println("Printing Even Numbers *2 : ");
			enl.printEvenNumbers();
			enl.retrieveEvenNumber(10);
		}
}
