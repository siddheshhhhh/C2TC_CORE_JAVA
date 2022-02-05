import java.util.LinkedList;
class MyStack
	{
	 	public static void main(String args[])
		{
			MyStack<Integer> s =new MyStack();

			s.push(12);
			s.push(24);
			s.push(36);
			int popped=s.pop();
			System.out.println(popped);
			
			
			int Peeked=s.peek();
			System.out.println(Peeked);
		}
	}

class MyStacks<E>
	{
		MyLinkedList<E> ll = new MyLinkedList();
		void push(E e)
		{
			ll.add(e);
		}
		E pop() throws Exception
		{
			if(ll.isEmpty())
			{
				throw new Exception("popping from empty stack cannot be done");
			}	
			 return ll.removeLast;
		}
		E peek() throws Exception
		{
			
			if(ll.isEmpty())
			{
				throw new Exception("peeking from empty stack cannot be done");
			}	
			 return ll.getLast;
		}
	}
	
c