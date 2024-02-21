package day5.assign5;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		 int count;            
	     String words[] = text.split(" "); 
	     String words1[] = text.split("\\s");	
	     System.out.println("Remove Duplicate Words in a String:"+"\n"+text+"\n\nDuplicate words in a given string : ");   
	     for(int i = 0; i < words.length; i++)
	     {  
	       count = 1;  
	       for(int j = i+1; j < words.length; j++) 
	       {  
	          if(words[i].equals(words[j]))
	          {  
	                 count++;  
	                 words[j] = " ";  
	           }  
	       }
	          if(count > 1 && words[i] != " ")  
	          {
	                System.out.println(words[i]+"\n");  
	          }

	        }
	       	
			for (int i = 0; i < words1.length; i++)
			{
				for (int j = 0; j < words1.length; j++)
				{
					if (words1[i].equals(words1[j]))
					{
						if (i != j)
							words1[i] = "";
	 
					}
				}
			}	 
			System.out.println("Removing Duplicate words:");
			for (int i = 0; i < words1.length; i++)
			{
	 
				if (words1[i] != "")
				{
					System.out.print(words[i]+" ");
	 
				}
			}
	
	}
}

	     
