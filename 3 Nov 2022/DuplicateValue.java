/*Q.2   Write a Java program to find the duplicate 
 * values of an array of integer values.*/

package pack.com;

public class DuplicateValue 
{
	public static void main(String[] args) {
		int arr[]= {3,1,6,8,5,3,7,8};
		int i;
		int count=0;
		System.out.println("The Duplicate elements are");
		for(i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					count++;
				}else
					break;
			}
			if(count>1)
			System.out.println(arr[i]+" - "+count);
			i+=(count-1);}}
}
