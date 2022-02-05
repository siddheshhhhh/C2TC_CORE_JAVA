import java.util.Scanner;
class PrimeNumber
 {
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);	
	  System.out.println("Enter no :");
	  int n = sc.nextInt();
	  boolean prime = true;

	  for ( int i =2; i*i<=n; i++) 
		{
		   if( n%i ==0)
		     {
			 prime = false;
			 System.out.println("Not a Prime Number "  +prime);
			 break;	
			
		     } 
		}
			 if ( n< 2)
			 {
				prime = false;
				
			 }
		 	
		         System.out.println("Prime Number " +prime);
	} 
}
			