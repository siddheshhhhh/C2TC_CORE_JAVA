class TwoPointAlgo
	{
	  public static void main(String[] args)
	    {
		
		boolean findTriplets(int arr[] , int n)
		{
		Arrays.sort(arr);
		for(i=0;i<n-2;i++)
		if(twoSum(arr, -arr[i],i+1)) return true;
		}
		return false;
	     }	
		 
		boolean twosum(int a[], int b,int j)
		  {
			j=a.length-1;
				while(i<j)
					{
					 if(a[i] + a[j] > b)
					   {
					    j--;
					   }
					  else if(a[i] + a[j] < b)
					   {
					   i++;
					   }
					  else
					  {
					 return true;
					  }
					}
					return false;
		 }
	    }
	}
	
				
			