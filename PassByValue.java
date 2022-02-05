class PassByValue
	{
		public static void main(String[] args)
		{
//	           int a=13,b=-19;
//		   swap(a, b);
//		   System.out.println(a +" "+b);
		    
//			Carni c1 = new Carni();
//			Carni c2 = new Carni();
//			c1.eat(3);
//			c2.eat(4);
//			swap(c1,d1);
//			System.out.println(c1.eat +" "  +c2.eat);
			
			ChangeCarni c = new ChangeCarni();
			c.eat(2);
			ChangeCarni(c);
			System.out.println(c.eat);


			
		}
		static void swap(int a,int b)
		{
      			int temp=a;
			a=b;
			b=temp;		
		}
		static void swap(Carni a,Carni b)
		{
      				Carni temp = a;
				a=b;
				b =temp;	
		}
		static void ChangeCarni(Carni ch)
		{
			ch.eat=10;
		}
		class Carni
			{	
				int eat;
			}
							
	}