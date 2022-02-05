package queue;
import java.util.*;
class QueueClass
	{
		public static void main(String args[])
		{
			Queue<Integer> q=new LinkedList<>();
			q.add(32);
			q.add(77);
			System.out.println(q);
			q.remove();
			System.out.println(q.remove());
			System.out.println(q.element());
			q.remove();
			q.poll();
		}
	}