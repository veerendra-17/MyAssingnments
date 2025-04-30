package week1.day2;

public class Palindrome 
{
	static int isPalindrome(int n, int rev_num)
    {
        if (n < 10) {
            return rev_num * 10 + n;
        }
        else {
            int last_digit = n % 10;
            rev_num = rev_num * 10 + last_digit;
            return isPalindrome(n / 10, rev_num);
        }
        
    }
	 public static void main(String[] args)
	    {
	        int n = 767;
	        int rev_num = isPalindrome(n, 0);

	        // verifying if n is same as reverse of n
	        if (n == rev_num)
	            System.out.println(n+" Number is Palindrome");
	        else
	        	System.out.println(n+"Number is Palindrome");
	    }

}
