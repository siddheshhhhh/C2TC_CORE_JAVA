class Human
	{
		int eyes,legs,hands;
		public void humandetails()
		{
			System.out.println("Human is eating");
			System.out.println("Human is dancing");
		}
			public void humaninfo()
		{
			System.out.println("Humans have"  + hands + " Legs " + legs + "Eyes" + eyes );
		}	
		
                
        }
class Animal
	{
		int hands,legs,eyes;
		public void animaldetails()
		{
			System.out.println("Animal is hunting");
			System.out.println("Animal is walking");
		}
		public void animalinfo()
		{
			System.out.println("Animal have" + hands + " Legs " + legs + " Eyes " + eyes );
	
		}	
	}
class Birds
        {	
		int feather,legs,hands;
		String breed;
		public void fly()
		{
			System.out.println("Bird is flying");
	        }
		public void fetch()
		{
			System.out.println("Bird is fetching");
		}	
			public void birdinfo()
			{
				System.out.println("Birds have" + hands + " Feather " + feather + " legs " + legs +" breed " + breed );
			}	
	}
public class MainClass
	{
		public static void main(String[] args)
		{
		Human h1= new Human();
		Animal a1=new Animal();
		Birds b1=new Birds();
		
		b1.feather=2;
		b1.legs=2;
		b1.hands=2;
		b1.breed="cattle";

		a1.hands=2;
		a1.legs=2;
		a1.eyes=2;

		h1.hands=2;
                h1.hands=2;
		h1.eyes=2;

		
		h1.humandetails();
		a1.animaldetails();
		b1.fly();
		b1.fetch();

		h1.humaninfo();
		a1.animalinfo();
		b1.birdinfo();
		}
	}
	
		
		