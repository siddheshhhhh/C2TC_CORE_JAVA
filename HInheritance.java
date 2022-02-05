class Operations
	{
		int a=10;
		int b=30;
	}
class Addition extends Operations
	{
		int c=a+b;
		void add()
		
		{
			System.out.println(c);
		}
	}
class Subtraction extends Operations
	{
		int d=a-b;
		void sub()
		
		{
			System.out.println(d);
		}
	}
class  HInheritance 
	{
		public static void main(String[] args)
		{
			Addition a1=new Addition();
			a1.add();

			Subtraction b1=new Subtraction();
			b1.sub();
			
		}
	}