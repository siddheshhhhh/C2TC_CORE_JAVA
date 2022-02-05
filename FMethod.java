class Student
	{
		int division;
		String name;
		public final void Description()
			{
				System.out.println("The Student Name"  + name);
			}
		
	}
class FMethod extends Student
	{
	//	public  void Description()
	//		{
        //				System.out.println("Inside Main class");
	//		}
		
		public static void main(String[] args)
		{
			FMethod f1=new FMethod();
			f1.Description();
		}
	}	