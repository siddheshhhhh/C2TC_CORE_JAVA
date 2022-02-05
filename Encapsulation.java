class Student
	{
		private int age;
		private String name;
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			if(age>18)
			{
			   System.out.println("u can vote");
			}else
			{
			   System.out.println("u cant vote");
			   this.age = age;
			}
		}	
	}
class Encapsulation
	{
		public static void main(String[] args)
		{
			Student s = new Student();
			s.setAge(17);
			System.out.println(s.getAge());
		}
	}