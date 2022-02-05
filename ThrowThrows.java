class ThrowThrows
 {
	public static void main(String[] args)
	{
		fun1();
	}
		 static void fun1()
	   {
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);

		try
		{
			fun2();
		}catch(Exception e1)
		{
			System.out.println(e1.getMessage()+ "Danger occured");
		}
	   }	
		static void fun2() throws ArrayIndexOutOfBoundsException
		{
		  boolean iserror = true;
		  if(iserror)
		 	 {
		 	  throw new ArrayIndexOutOfBoundsException("Dangerous Situation");
			 }
		}
 }