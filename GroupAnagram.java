import java.util.*;
class GroupAnagram
	{
	  public List<List<String>> groupAnagrams(String[] strs)
		{
			for(String s:strs)
			{
			char charArray[]=s.toCharArray();
			Arrays.sort(charArray);
			String sorted=new String(charArray);
		
			if(!map.containsKey(sorted))
			{
				map.put(sorted, new Linkedlist<String>());
			}
			map.get(sorted).add(s);
		}
			return new LinkedList<>(map.values());
	    }	
	}