package day2.ass2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
	System.out.println("Finding Missing element on array\n");
	int[] a={1,4,3,2,8,6,7};
	int m=-1;
	int n=a.length;
	 Arrays.sort(a);
	 for(int i=0;i<n;i++)
	 {
		 if (a[i] != i+1)
		 {
		        m = i+1;
		        System.out.println("\t" +m);
		        break;
	     }
		
	 }
	 
	}
	

}
