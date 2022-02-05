class MultipleCatch
	{
	  public static void main(String[] args)
	   {
		try
		  {
		    int a[]=new int[5];
		    System.out.println(a[6]);
		   }catch(ArithmeticException e)
		    {
			System.out.println(e.getMessage() +"occured,please see ur code");
		    }catch(ArrayIndexOutOfBoundsException e)
		    {
			System.out.println("Index should be in between 0 to 5");
		    }catch(IllegalArgumentException e)
		    {
			System.out.println("Check your casting carefully");
		    }finally
		    {
			System.out.println("Sorry for the problem");
		    }

		     System.out.println("Very important code");
		     System.out.println("need to run");
		}
	}

	
			
			