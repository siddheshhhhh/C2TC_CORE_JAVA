public class TableInNested
	{
	  public static void main(String[] args)
		{
			for (int i= 1; i<=30; i++)
			 {
				int table = i;
				for(int j=1; j<11; j++)
				{
				  System.out.print(table * j  + " ");
				} 
			  }
				System.out.println();
		}
	}