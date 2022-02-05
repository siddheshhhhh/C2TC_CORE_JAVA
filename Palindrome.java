import java.util.Scanner;
class Palindrome
 {
	public static void main(String[] args)
    {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	int temp =n;
	int reversed = 0;
	while(temp> 0)
	{
		int lastdigit = temp % 10;
		reversed = reversed *10 + lastdigit;
		temp /= 10;
	}
	 if( reversed ==n)
		{
		  System.out.println("Palindrome");
		}
	    else
		{
	          System.out.println("Not a palindrome");
		}
    }
 }	