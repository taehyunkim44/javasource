package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort2 {
	public static void main(String[] args) {
		
//		int arr[] = {27,21,56,99,88,58,62,15,39,78};
		Integer arr[] = {27,21,56,99,88,58,62,15,39,78};
		
				
		//내림차순 정렬
		//The method sort(int[]) in the type Arrays is not applicable for the arguments
		//sort(T[] a, Compar~)
		//T, E, K, V: 객체
		
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
	}
}
