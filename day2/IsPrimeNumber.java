package week1.day2;

public class IsPrimeNumber 
{
public static void main(String[] args) 
{
	int num =13;
	int count=0;
	
	for (int i = 2; i * i < num-1; i++) 
	{
        if (num % i == 0)
        	count++;
	}
		if(count >0)
		{
			System.out.println(num+" Is not a prime");
		}
		else 
		{
			System.out.println(num+" Is Prime");
			
		}
		
		
	
	
}
}
