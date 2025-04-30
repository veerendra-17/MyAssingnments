package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args)
	{
		int version =10;
		
		if(version > 0)
		{
			System.out.println("Given version number is positive:"+version);
		}
		else if (version < 0) 
		{
			System.out.println("Given version number is negative:"+version);
		}
		else 
		{
			System.out.println("Given version number is zero:"+version);
		}
		

	}

}
