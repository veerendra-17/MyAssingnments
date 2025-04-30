package week1.day2;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		System.out.println("\n..........Fibonacci series.........\n");
		int n=8, firstnum=0,secondnum=1;
		for (int i=0; i<=n; ++i) 
		{
			System.out.println(firstnum+"");
			int lastnum= firstnum + secondnum;
			firstnum = secondnum;
			secondnum = lastnum;
			
		}

	}

}
