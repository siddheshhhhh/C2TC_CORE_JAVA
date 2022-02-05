import java.util.*;
 class SetOperations
	{
		public static void main(String[] args)
		{
			Set<Integer> a=new HashSet<>();
	
			a.add(23);			
			a.add(1);
			a.add(6);
			

			Set<Integer> b=new HashSet<>();

			b.add(1);
			b.add(12);
			b.add(60);
	
		//	a.addAll(b);
		//	System.out.println(a);

		//	a.retainAll(b);
		//	System.out.println(a);

			
			System.out.println(a.containsAll(b));
			
			
		}
	}