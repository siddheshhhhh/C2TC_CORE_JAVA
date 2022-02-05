import java.util.Scanner;
class Pattern5
	{
	   public static void main(String [] args)
	    {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=1; i<=n ; i++)
		{
		  for(int j=1 ; j<=i+1; j++)
		   {	

			System.out.print("");
		   }
		   for(int p=1; p<=n-i+1; p++)
		 	 {
		  	    System.out.print("*");
			 }
		   System.out.println();
	         }
	     }
	 }
				
