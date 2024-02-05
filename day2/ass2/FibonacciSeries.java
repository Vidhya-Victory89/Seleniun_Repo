package day2.ass2;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=8,n;
		System.out.println("Fibonacci Series\n");
		System.out.print(a+"\t"+b);
		for(int i=2;i<c;i++)
		{
			n=a+b;
			System.out.print("\t"+n);
			a=b;
			b=n;
			
		}
	}
}
