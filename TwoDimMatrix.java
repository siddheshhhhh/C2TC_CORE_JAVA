import java.util.Scanner;
class TwoDimMatrix
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Dimension");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int rows[][] = new int[a][b];
			int columns[][] = new int[a][b];  

			System.out.println("Enter Array a: ");
			for(int i=0; i<a; i++)
			{
			    for(int j=0; j<b ;j++)	
			    {
			    rows[i][j]=sc.nextInt();
			    }
			}
			
			System.out.println("Enter Array b: ");
			for(int i=0; i<a; i++)
			{
				for(int j=0; j<b; j++)
				{
				 columns[i][j]=sc.nextInt();
				}
			}
			
			int c[][] = new int[a][b];
			for(int i=0; i<a; i++)
			{
				for(int j=0; j<b; j++)
				{
					 c[i][j]= rows[i][j] * columns[i][j];
				}
			}
			   System.out.println("Result array C: ");
			   for(int i=0;i<a;i++)
				{
					for(int j=0;j<a;j++)
						{
						  System.out.print(c[i][j] +" ");
						}
					System.out.println();
				}
		}
}

	