import java.util.Scanner;
class SumOfDigits
	{
	  public static void main(String[]  args)
	   {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter No:");
		int n =sc.nextInt();
		int sum = 0;
		int temp = n;
		while (temp>0)
		{
			int lastno = temp%10;
			temp /=10;
			sum += lastno;
			System.out.println(lastno +" "+ temp +" " + sum +" "); 

		}
		System.out.println("The sum of digits is of " + n + " is " + sum);

	    }
	
	}
			
