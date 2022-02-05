import java.util.Stack;
class StackClass
	{
	 	public static void main(String args[])
		{
			Stack<Integer> s =new Stack();
			s.push(43);
			s.push(54);
			s.push(32);
			int popped=s.pop();
			popped=s.pop();
			System.out.println(popped);
			int Peeked=s.peek();
			System.out.println(Peeked);
		}
	}
