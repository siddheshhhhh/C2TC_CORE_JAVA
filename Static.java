public class A
	{
	class B
		{}
static class C
		{
				
		}
	}	
		static
			{
				System.out.println(" passed capegemini ");
			}
		static 
			{
				System.out.println("Passed infosys");
			}
public class Static
	{
		public static void main(String[] args)
		{
			System.out.println("Inside Main");
			System.out.println(Math.max(2,41));
			System.out.println(Math.min(2,41));
			System.out.println(Math.PI);
			A a1 =new A();
			A.B b1= a1.new B();
			C c1 = new A.C();
		}
		static 
			{
				System.out.println("passed wipro");
			}
	}
