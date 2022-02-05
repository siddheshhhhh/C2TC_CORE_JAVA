import java.util.Scanner;
class DoWhile1
	{
	  public static void main(String[] args)
	    {
		Scanner sc = new Scanner(System.in);
		int n =1;
		do{
			System.out.println("Enter No");
			n = sc.nextInt();
		   } while( n != 0);
	    }
	}		