package task6;
import java.util.*;
public class Tapsiriq1 {
	
	//TASK1 
	public static void reverse(int[] arr) {
		
		int[] arrCopy = arr;
		
		
		for(int i = 0 ; i < arr.length / 2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			
			if(arr[i] > arr[(arr.length-1)/2]) {
				
				arr[i] = arrCopy[arrCopy.length -1 - i];
				
			}		
			
			if(arr[i] <= arr[arr.length/2]){
		
				arr[i] = arr[arr.length - 1 - i];
			
			}	
}
	System.out.println(Arrays.toString(arr));
}	
	
	
//	public static int[] reverseShort(int[] arr) {
//		
//		for(int i = 0; i < )
//		
//		
//	
//	}

//TAKSlarin yoxlanmasi
public static void main(String args[]) {
	
	int[] arr = new int[] {1, 4, 5 , 6,  3 , 9};
	
	reverse(arr);
	
	int[] bir = new int[] {2 , 3, 8};
	
	int[] iki = new int[] {2 , 3 , 6};
	
	equals(bir , iki);
	
	System.out.println(equals(bir , iki));
	
	
	
	
	
	
}
//TASK2
public static boolean equals(int[] a, int[] b) {
	boolean equal = true;
	if(a.length == b.length) {
		for(int i = 0; i< a.length; i++) {
			
			if(a[i] != b[i]) {
				 equal = false;
				 break;
			
			}
			
		}
	}
	else equal = false;
	
	return equal;
}
//TASK3









}