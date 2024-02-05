package day2.ass2;

public class IsPrime {

	public static void main(String[] args) {
		 int i,a=0,b=0;      
		  int n=5;   
		  a=n/2;    
		  System.out.println("Check Number IsPrime\n");
		  if(n==0||n==1)
		  {  
		   System.out.println("The number "+n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=a;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println("The number "+n+" is not prime number");      
		     b=1;      
		     break;      
		    }      
		   }      
		   if(b==0)
		   {
			   System.out.println("The number "+n+" is prime number");
		   }  
		  }

	}

}
