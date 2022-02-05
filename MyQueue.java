import java.LinkedList.Node;
class MyQueue
	{
		public static void main(String args[])
		{
			MyQueue<Integer> mq=new MyQueue<>();
			
			mq.enqueue(12);
			mq.enqueue(2);
			mq.enqueue(3);
			mq.enqueue(45);

			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());

			mq.enqueue(451);
			System.out.println(mq.dequeue());
			
		}
	}

class Queue<E>
	{
		Node<E> head,rear;
		void enqueue(E e)
		{
			Node<E> toAdd=new Node<>(e);
			if(head==null)
			{
				head=rear=toAdd;
				return;
			}
			rear.next=toAdd;
			rear=rear.next;
		}
		 E dequeue()
		if(head==null)
		{
			return null;
		}
			
		{
			Node<E> temp=head;
			head=head.next;
			if(head==null)
			{
				rear=null;
			}
			return temp.data;
		}
	}
 