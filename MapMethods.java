import java.util.*;
import java.util.Map.Entry;
class MapMethods
	{
		public static void main(String[] args)
		{
			Map<String,Integer> add=new HashMap<>();
			add.put("Apple",1);
			add.put("Ant",2);
			add.put("Aeroplane",3);
			System.out.println(add);

			add.put("Ant",4);
			System.out.println(add);

			add.putIfAbsent("Aeroplane",5);
			System.out.println(add);
		
			System.out.println(add.get("Apple"));
			System.out.println(add.get("Fire"));

			System.out.println(add.containsKey("Ant"));
			System.out.println(add.containsKey("Air"));

			System.out.println(add.containsValue(2));
			System.out.println(add.containsValue(5));

			add.remove("Aeroplane");
			System.out.println(add);

			
			System.out.println(add.keySet());
			
			
			System.out.println(add.values());


			System.out.println(add.entrySet());

			Set<Entry<String,Integer>> entry=new add.entrySet();

			for(Entry<String,Integer> entries:entry)
			{
				entries.setValue(entries.getValue() * 200);
			}
			 
			System.out.println(add);


		}
	}