import java.util.Scanner;
class ArrayAverage
	{
	     public static void main(String[] args)
		{
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter no of Students");
	           int n=sc.nextInt();
		    int marks[] =new int[n];
		    System.out.println("Enter Marks");
		    for(int i =0; i<n; i++)
			{
		          marks[i]=sc.nextInt();
			}
		     int average =0;
			for( int i=0; i<n; i++)
			{
			average += marks[i];
                         }
			average /=n;
		System.out.println("Average: "+ average);
		}
	}