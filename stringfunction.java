class stringfunction
 {
	public static void main(String[] args)	
	{
		String fruits = "Apple,Banana,Orange,Grapes,Watermelon"; 
		String variousFruits[] = fruits.split("a");
		String friend = "Siddhesh";
		String friends = "     Siddhesh   ";
		friend = friend + "  Agnihotri";

		System.out.println(friend.charAt(5));
		System.out.println(friend.length());
		System.out.println(friend.substring(4));
		System.out.println(friend.substring(5, 8));
		System.out.println(friend.contains("Siddhesh"));
		System.out.println(friend.equals(friends));
		System.out.println(friend.isEmpty());
		System.out.println(friend.concat("  Srushti"));
		System.out.println(friend.replace('i','I'));
		for(String fruit: variousFruits)
			{
         			System.out.println(fruit);
			}
		System.out.println(friend.indexOf('h'));
		System.out.println(fruits.toLowerCase());
		System.out.println(fruits.toUpperCase());
		System.out.println(friends.trim());	
		
	}
 }
