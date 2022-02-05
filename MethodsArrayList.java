import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
class MethodsArrayList
	{
		public static void main(String[] args)
		{
			List<String> fruits = new LinkedList();
			List<String> vegetables = new ArrayList();

			fruits.add("Apple");
			fruits.add("Grapes");
			fruits.add("Banana");

			vegetables.add("Potato");
			vegetables.add("LadiesFinger");
			vegetables.add("Carrot");

			fruits.addAll(vegetables);

 			System.out.println(fruits.get(1));

			fruits.set(1, "Watermelon");
		        System.out.println(fruits);

			fruits.remove(1);
		        System.out.println(fruits);
		
			List<String> toRemove=new ArrayList();
			toRemove.add("LadiesFinger");
			toRemove.add("Carrot");
			fruits.removeAll(toRemove);
		
			System.out.println(fruits);

			vegetables.clear();
		
			System.out.println(fruits);
		
			System.out.println(fruits.size());
	
			System.out.println(fruits.contains("Grapes"));

			System.out.println(fruits.isEmpty());

			String temp[]=new String [fruits.size()];
			fruits.toArray(temp);
			for(String s: temp)
			{
				System.out.println(s);
			}

		}
	}	