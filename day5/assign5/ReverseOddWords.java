package day5.assign5;
public class ReverseOddWords {

	public static void main(String[] args) {
	    String str1="I am a software tester";  
	    String[] words = str1.split(" ");  
	    String revString ="";
	    System.out.println("Reverse Odd Words in a String:\n"+str1);
	    System.out.println("\nThe Output String is:");
	    for (int i = 0; i < words.length; i++)
	    {
	       String word = words[i];
	       String reverseWord = "";
	       if (i % 2 == 1)
	       {  
	         for (int j = word.length() - 1; j >= 0; j--) {
	         reverseWord = reverseWord + word.charAt(j);
	        }
     	    }
        	else
	       {
		     reverseWord = reverseWord +words[i]+" ";
	       } 	 
	    revString = revString + reverseWord + " ";	 
	}
	System.out.println(revString);
}
}
