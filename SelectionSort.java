class SelectionSort
	{
	  public static void main(String[] args)
	 {
	    int a[] ={ -9 ,1,-8,2,-7,5 };
	    int n=a.length;
	
	    for(int i=0;i<n-1; i++)
	    {
	    int MinInd = i;
	    {
		for(int j=i; j<n; j++)
		{
		 if(a[j]<a[MinInd])
		  MinInd = j;
		 }
	     }
		 int temp =a[i];
		 a[i]=a[MinInd];
		 a[MinInd]=temp;
	}
	        for(int e: a)
	         {
			System.out.print(e+" ");
		}
	}
}