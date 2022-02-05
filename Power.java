import java.util.Scanner;
class Power
	{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbers a and b ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c =1;
			for(int i =0; i<b ;i++)
		{
			c *= a ;
			
		}
			System.out.print(c);
			
		}
	}