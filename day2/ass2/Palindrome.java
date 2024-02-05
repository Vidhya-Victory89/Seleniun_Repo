package day2.ass2;

public class Palindrome {

	public static void main(String[] args)
	{
		int input=121,output=0,rem,i;
		 output=input;
		 System.out.println("Palindrome");
		 for(i = 0; input > 0; input = input/10) 
		 {
				rem = input %10;
				i = i * 10 + rem;
			}
		 System.out.println("Reversed number: " +i);
		 
		if(i==output)
		{
			System.out.println("The number "+output+" is a palindrome");
		}
		else
		{
			System.out.println("The number "+output+" is not a palindrome");
		}
	}

}
