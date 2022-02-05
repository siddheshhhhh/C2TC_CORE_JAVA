import java.util.*;
class SetInterface
	{
		public static void main(String[] args)
		{	
			Set<String> fruits=new LinkedHashSet<>();
			
			fruits.add("Banana");
			fruits.add("Apple");
			fruits.add("Grapes");	
			System.out.println(fruits.add("Watermelon"));

			System.out.println(fruits.add("Apple"));
			System.out.println(fruits);
		}
	}
