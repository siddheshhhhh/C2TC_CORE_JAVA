import java.util.Scanner;
class DoWhile
	{
	  public static void main(String[] args)
	   {
		Scanner sc =new Scanner(System.in);
		int n;
		int x =1; 
		int sum=0;
	         System.out.println("Enter Number:");
			 n=sc.nextInt();
		do{	
			sum=sum+x;
		        if( x%2 ==0)
		          {
		       		 System.out.println("Even" + n);	
			  }
			else
			   {
			  	 System.out.println("Odd" + n);	
		           }
			   
		    }	  while( x<=n);
			  sc.close();
		
	     }	
	}		
			