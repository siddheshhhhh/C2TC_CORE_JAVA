import java.util.Scanner;
class Pattern6
	{
	  public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Number:");
			int n =sc.nextInt();
			for( int i =1; i<=n; i++)
			{
		          for( int j=1; j<=n-1; j++)
				{
				  System.out.print("  ");
				}
			  for( int p=1; p<=i; p++)
			        {
				  System.out.print("*   ");
				}
				System.out.println();
			}
		}
        }
