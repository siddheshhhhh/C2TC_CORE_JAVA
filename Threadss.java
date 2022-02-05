class Threadss
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
			Thread.sleep(5000);
		} catch (InterruptedException e1)
		{
			e1.printStackTrace();
		}
		   System.out.println("After some time");
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