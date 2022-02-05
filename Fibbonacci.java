import java.util.Scanner;
class Fibbonacci
	{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int n=sc.nextInt();
			int a=0;
			int b=1;
			for(int i =0; i<=n-2 ;i++)
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
			
		}
	}