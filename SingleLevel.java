class Area
	{
		int b=6,l=5;
		float c;
		
	}
class Rectangle extends Area
	{
		void calculate()
		{
			c=b*l;
		}
		void area()
		{
			system.out.println("The area of rectangle is"+c);
		}
	}
class SingleLevel
	{
		public static void main(String[] args)
		{
			SingleLevel s=new SingleLevel();
			s.calculate();
			s.area();
		}
	}