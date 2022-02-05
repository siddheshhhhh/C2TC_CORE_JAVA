class Animal
	{
		void walk()
		{
			System.out.println("Animal is walking");
		}
	}
class Pet extends Animal
	{
		void walk()
		{
			System.out.println("Pet is walking");
		}
	}
class Dog extends Pet
	{
		void walk()
		{
			System.out.println("Dog is walking");
		}
	}
class CompilePoly
	{
		public static void main(String[] args)
		{
			stay("sid",3);
		}
			static void stay(String s)
			{
				System.out.println("Hydrated");
			}
			static void stay(String s,int a)
			{
				for(int i=0;i<a;i++)
				{
					System.out.println(s);
				}
			}
			static void stay()
			{
				System.out.println("motivated");
			}
			
	}
			