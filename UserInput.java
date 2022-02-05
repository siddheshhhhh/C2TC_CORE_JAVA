import java.util.Scanner;

public class UserInput
	{
		public static void main(String[] args)
		{
			int x = 101;
			long y = x;
			System.out.println("x");
			System.out.println("y");

			float myfloat = 6.2342f;
			int myInt = (int)myfloat;
			System.out.println("myfloat");
			System.out.println("myint");

			Scanner sc = new Scanner(System.in);
			String hello = sc.nextLine();
			System.out.println("hello");
	
	
			int base = sc.nextInt();
			System.out.println("Enter base");
			
			int height = sc.nextInt();
			System.out.println("Enter height");

			float area = (base * height)/2;
			System.out.println("area");
		}
	}
			