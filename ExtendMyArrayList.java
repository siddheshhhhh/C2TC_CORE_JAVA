import java.util.ArrayList;
class Pair<X, Y>
	{
		X x;
		Y y;
		Pair(X x,X y)
		{
			this.x=x;
			this.y=y;
		}
			void getDescription()
		     	{
			   System.out.println(X +" and "+ Y);
			}
		
	}
class MyArrayList
	{
		public static void main(String[] args)
		{
		Pair<String,Integer> p1  = new Pair("Siddhesh",43);
		Pair<Boolean,String> p2  = new Pair(true,"Good");

		p1.getDescription();
		p2.getDescription();
		}
	}
