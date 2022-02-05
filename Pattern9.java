import java.util.Scanner;
public class Pattern9
    {
	  public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number");
	  int n= sc.nextInt();
	  System.out.print("*");

	  for( int i=2; i<=n-1; i++)
	  {
	   System.out.println("* ");
		for(int j=1; j<=i-2; j++)
		{
		  System.out.print("  ");
		}
                  System.out.print("* ");
		  System.out.println();
	  }
	  for( int p =1; p<=n; p++)
	   {
	     System.out.println("* ");
	   }
	 }	
     }	   