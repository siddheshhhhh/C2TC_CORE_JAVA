class Animal
	{
		void walk()
		{
			System.out.println("Animal is walking");
		}
	}
class Pet extends Animal
	{
			String name = "Mike";
		void walk()
		{
			System.out.println("Pet is walking");
		}
	}
class Dog extends Pet
	{
			String name = "Dobby";
		void walk()
		{
			System.out.println("Dog is walking");
		}
	}
class RunPoly
	{
		public static void main(String[] args)
		{
			Dog d =new Dog();
			Pet p=d;
			Animal a=d;
			p.walk();
			d.walk();

			System.out.println(d.name);
			System.out.println(p.name);
		}
	}
			