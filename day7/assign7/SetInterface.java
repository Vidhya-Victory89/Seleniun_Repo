package day7.assign7;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String companyName="google";
		System.out.println("Set Interface in Java");
		System.out.print("The Unique Characters are:  ");
		Set<Character> cmpny=new LinkedHashSet<Character>();
		for(char c: companyName.toCharArray()) 
		{
			cmpny.add(c);
        }
        for(char c: cmpny)
        {
            System.out.print(c);
        }
        }

}
