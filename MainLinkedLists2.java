import java.util.*;
class MainLinkedLists2
	{
		public static void main(String[] args)
		{
			MyLinkedLists myLL =new MyLinkedLists();
			myLL.add(12);
			myLL.add(56);
			myLL.print();
		}
	}

		
class MyLinkedLists
	{
		Node head;
		void add(int data)
		{
		
		  Node toAdd =new Node(data);
			
				if(isEmpty())
				{
					head=toAdd;
					return;
				}
				Node temp=head;
				while(temp.next !=null)
				  {
					
					temp=temp.next;
				  }
					temp.next=toAdd;
		}
			void print()
			{
				Node temp=head;
				while(temp !=null)
				  {
					System.out.println(temp.data +" ");
					temp=temp.next;
				  }
			}
				
		    boolean isEmpty()
			{
				return head==null;
			}

			static class Node
			{
				int data;
				Node next;
		
			Node(int data)
			{
				this.data=data;
				next=null;
			}
		}
	}			