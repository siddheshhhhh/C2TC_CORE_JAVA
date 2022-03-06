class TwoPointAlgoSum
	{
		public static void main(String[] args)
		  	{
				public boolean twosum(int a[], int b)
					{
						int i=0;j=a.length -1;
						while(i<j)
						{
							if(a[i] -a[j] > b)
							{
								j--;
							}
							else if(a[i] + a[j] < b)
							{
								i++;
							}
						}else
							{
							 return true;
							}
						}
						return false;
			}
	}
	
				
			