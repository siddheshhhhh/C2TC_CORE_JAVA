import java.util.Scanner;
public class AddSubOfFraction
	{
	  public static void main(String[] args)
	   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		float res =0;
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			 {
			  res -= 1/i;
			 }
			else
			   {
		            res += 1/i;
			   }
		}
		System.out.println(res);
	   }
     }		