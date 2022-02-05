import java.util.Scanner;
class SwitchCase
	{
	public static void main(String[] args)	
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter 1st no ");
			int a = sc.nextInt();
		
			System.out.println(" Enter 2nd no ");
			int b = sc.nextInt();
			
			System.out.println(" 1.Addition ");
			System.out.println(" 2.Subtraction ");
			System.out.println(" 3.Multiplication ");
			System.out.println(" 4.Division ");
			System.out.println(" Enter operation ");
			int ch=sc.nextInt();
			int c = 0;
		
			switch (ch)
			{
				case 1:
				c = a+b;
				break;
			
				case 2 : 
				c = a-b;
				break;
	
				case 3 : 
				c = a*b;
				break;
		
				case 4 : 
				c = a/b;
				break;

			default :
				System.out.println(" Invalid choice");
			}
				System.out.println("The result is " +c);
		}
}
			