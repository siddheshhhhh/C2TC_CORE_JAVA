class Person
	{
		String name;
		public void work()
		{
		  System.out.println("Person" + name +" is working");
		}
		public void read()
		{
		  System.out.println(name +"is reading");
		}
		
	 }
class Teacher extends Person
	{
		public void teach()
		{
			System.out.println(name + " is teaching");
		}
		public void read()
		{
			System.out.println("Teacher" + name +" is reading");
		}
		
	}
class Singer extends Teacher
	{
		public void sing()
		{
			System.out.println(name + " is Singing");
		}
		public void read()
		{
			System.out.println("Singer" + name + "is reading");
		}
		
	}
class Inheritance
	{	
		public static void main(String[] args)
		{
			Teacher t = new Teacher();
			t.name="ABC";
			t.work();
			t.read();
			t.teach();
			


			Singer s = new Singer();
			s.name="Himesh";
			s.sing();
			s.teach();
			s.read();
			
			
			
		}
	}