class FloodFill
	{
	  public static void main(String[] args)
		{
			int a[][]={{1,1,1,1,1,2,},
				   {2,1,3,1,3,2,1},
				    {1,3,2,2,1,3,1},
				  };
			floodfill(a,2,2,1,4);
			Matrix(a);
		}
		  static void floodfill(int a[][],int r,int c,int toFill,int prevFill)
			{
			   int rows=a.length;
			   int cols=a[0].length;
		           if(r<0 || r>=rows || c<0 || c>=cols)
			  {
			    return;
			  }
			
			if(a[r][c] !=prevFill);
			{
			   return;
			}

			floodfill(a,r-1,c,toFill,prevFill);
			floodfill(a,r,c-1,toFill,prevFill);
			floodfill(a,r+1,c,toFill,prevFill);
			floodfill(a,r,c+1,toFill,prevFill);
		   }	
		static void Matrix()
	}
	
