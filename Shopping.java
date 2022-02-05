class Hornet extends Car
	{
	 public void increase()
		{
			System.out.println("Increasing Speed of hornet");
		}
	 public	void breaking()
		{
			System.out.println("Decreasing speed of hornet");
		}
	}
class Pept extends Car
	{
		
		void increase()
		{
			System.out.println("Increasing Speed of pept");
		}
		void breaking()
		{
			System.out.println("Decreasing speed of hornet");
		}
		
	}
abstract class Car
	{
		abstract void increase();
		abstract void breaking();
		void horn()
		{
			System.out.println("vehicle is horning");
		}

		
	}
public class Shopping
  {
	static void shop(Car vehicle)
	{
		System.out.println("Vehicle has been taken");
	}

	public static void main(String[] args)
	{
		Hornet h= new Hornet();
		Pept p= new  Pept();
		
		shop(h);
		shop(p);
	}
 }
