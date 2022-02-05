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
		void laugh()
		{
			System.out.println("Teacher is laughing");
		}
	}
class SingleInheritance
	{	
		public static void main(String[] args)
		{
			Teacher t = new Teacher();
			t.name="ABC";
			t.work();
			t.read();
			t.teach();
			t.laugh();
		}
	}