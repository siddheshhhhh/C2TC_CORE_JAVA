public class NestedTernary
 {
	public static void main(String[] args)
		{
			int a = 10,b = 20,c = 30;
			int temp =0;
			temp = a > b ? a > c ? a : c :  b > c ? b : c;
			System.out.println(" The greatest no " +temp);
		}
}