public class NestedIfElse
 {
	public static void main(String[] args)
		{
			int a = 10,b = 20,c = 30;
			int temp =0;
			
			if(a>b)
			{
				if(a>c)
				  {
					temp = a;
				  } else 
					  {
				            temp = c;
					   }
			}
			else
			  {
				
				if(b>c)
				{
					  temp = b;
				} else
					{
						temp = c;
					}
			  }
			   
				System.out.println(" The greatest no is " +temp);
			

		}
}
			
			