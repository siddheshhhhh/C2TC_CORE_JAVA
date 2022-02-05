import java.util.*;
class Permutation
	{
	   	static Set<String> set=new HashSet<>();
         	public static void main(String[] args)
		{
			permutations("abcd ",0,3);	
		}
		static void permutations(String s,int l,int r)
		{
		if(l==r)
		 {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		 }
		
		for(int i=1;i<=r;i++)
		 {
			s=interchangeChar(s,l,i);
			permuations(s,l+1,r);
			s=interchangeChar(s,l,i);
		 }
		}
		static String interchangeChar(String s,int a,int b)
		{
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]=temp;
		return String.valueof(array);
		}
	}