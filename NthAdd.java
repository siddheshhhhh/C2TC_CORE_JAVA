import java.util.Scanner;
class NthAdd
 {
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);	
	  System.out.println("Enter no :");
	  int n = sc.nextInt();
	  float result =0;
	  for ( float i =1; i<=n; i++) 	
		{
		   result += 1/i;
		}
		 	
		         System.out.println(result);
	} 
}
			