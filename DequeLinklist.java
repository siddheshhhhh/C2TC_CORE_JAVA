import java.util.LinkedList;
import java.util.ArrayDeque;
class MyDeque<E>
	Node<E> head, tail;
	void addToHead(E data)
	{
		Node<E> ToAdd=new Node<>(data);
		{
			if(head==null)
			{
				head=tail=toAdd;
				return;
			}
				head.next=toAdd;
				toAdd.prev=head;
				head=toAdd;
		}

		E removeLast()
		{
			if(head==null)
			{
				return null;
			}
			Node<E> toRemove =tail;
			tail=tail.next;
			tail.prev=null;
			if(tail==null)
			{
				head=null;
			}
			return toRemove.data;
		}
			
		static class Node<>
		{
			E data;
			Node<E> next,prev;
			Node(E data)
			{
			  this.data=data;
			  this.next=this.prev=null;
			}
		}
	}

class DequeLinklist
	{
		public static void main(String[] args)
		{
			ArrayDeque<Integer> ad=new ArrayDeque<>();
			ad.toAdd(12);
			ad.toAdd(23);
		
			ad.removeLast();
			System.out.println(ad.peek());
		}
	}
 