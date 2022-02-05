import java.util.Scanner;
class Pattern8
	{
	  public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter No:");
			int n=sc.nextInt();
			int rows =2*n-1;
			for( int i=1; i<=rows; i++)
			{
				if( i<=n)
				{
				  for( int j=1; j<=i; j++)
				 {
				   System.out.print("* ");
				 }
				}
				else
				{
				  for(int p=1; p<=rows-i+1; p++)
				  System.out.println("* ");
		                 }
				 System.out.println();	  
			}
				
               }
	}