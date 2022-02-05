import java.util.*;
class MainLinkedLists1
	{
		public static void main(String[] args)
		{
			List<Integer> ll=new LinkedList<>();
			List<Integer> al=new ArrayList<>();

			getTimeDiff(al);
			getTimeDiff(ll);
			
		}
	
	static void getTimeDiff(List<Integer> List)
	{
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			List.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(List.getClass().getName() +"-->" + (end - start));
	}
 	}


			