 class Car{
		int wheels;
		String color;
		int headlights;
		double average;

		Car()
		{}
         Car(int wheels)
	{
		this.wheels =wheels;
		headlights =2;
	}
	
 	Car(String color,int wheels)
	{
		this.color=color;
		this.wheels=wheels;
		headlights =2;
		
	}
	Car(int wheels,double average)
	{
		this.wheels = wheels;
		this.average = average;
		headlights =2 ;
	}
}
public class MyConstructor
	{
		public static void main(String[] args)
		{
			Car c1 = new Car(2);
			Car c2 = new Car(4);
		
			Car bike = new Car("yellow",3);
			Car scooty = new Car(3,44.4f);
			Car random = new Car();


			System.out.println(bike.color +" Color " + bike.wheels +" Wheels "); 
			System.out.println(scooty.wheels +" Wheels " + scooty.average +" Average ");
		}
	}	
			 