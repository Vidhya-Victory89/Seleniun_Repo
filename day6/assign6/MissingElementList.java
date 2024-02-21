package day6.assign6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList
{
	public static void main(String[] args)
	{
	     List<Integer> arrayList = new ArrayList<Integer>(); 
	     List<Integer> otherlist=new ArrayList<Integer>();
	     arrayList.add(1);
	     arrayList.add(2);
	     arrayList.add(3);
	     arrayList.add(4);
	     arrayList.add(10);
	     arrayList.add(6); 
	     arrayList.add(8); 
	     System.out.println("Elements in the Array: "+arrayList);
	     Collections.sort(arrayList); 
	     System.out.println("Sorted Array is: "+arrayList);
	     for (int i = 1; i <=10; i++)
	     {
	    	   if (!arrayList.contains(i))
	    	   {
	    	      otherlist.add(i);
	    	   }
	    }
	     System.out.println("Missed Numbers are: "+otherlist);      
	     
        }		
		}
             
	

	

