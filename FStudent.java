class Student
	{
		final int rollNo;
		final String name;
		{
			rollNo=1;
		}
		public Student()
		{
			name="Siddhesh";
		}
	}
public class FStudent
	{
		public static void main(String[] args)
		{
		final Student s1=new Student();
		Student s2=new Student();
		s2.name="Sid";
		System.out.println(name);
		}
	}