class Hornet
	{
		void increase()
		{
			System.out.println("Increasing Speed of hornet");
		}
		void break()
		{
			System.out.println("Appling Break of hornet");
		}
	}
class Pept
	{
		
		void increase()
		{
			System.out.println("Increasing Speed of pept");
		}
		void break()
		{
			System.out.println("Appling Break of pept");
		}
	}
class car
	{
	}
class Shop
 {
	static void shop(Hornet vehicle)
	{
		System.out.println("Vehicle has been taken");
	}
	static void shop(Pept vehicle )
	{
		System.out.println("Vehicle has been taken");
	}
	public static void main(String[] args)
	{
		Hornet h=new Hornet();
		Pept p= new  Pept();
		
		shop(h);
		shop(p);
		
	}
}
