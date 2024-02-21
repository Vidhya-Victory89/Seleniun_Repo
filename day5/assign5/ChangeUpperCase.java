package day5.assign5;

public class ChangeUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
        System.out.println("The Input String is :"+test);
	    char[] chars = test.toCharArray();
	    char[] chars1 = test.toCharArray();
	    for (int i = 1; i < test.length(); i++) {
	    	if(i%2!=0)
	    	{
	        chars[i] = Character.toUpperCase(chars[i]);
	    	}
	    }
	    String result = new String(chars);
	    System.out.println("The First Output String is :"+result);
	    for (int i = 0; i <test.length(); i++) {	  
	    	if(i%2==0)
	    	{
	        chars1[i] = Character.toUpperCase(chars1[i]);	    
	    	}
	    }
	    String result1 = new String(chars1);
	    System.out.println("The Second Output String is :"+result1);
	}

}
