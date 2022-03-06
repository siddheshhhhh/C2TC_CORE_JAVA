class AppConfig
	{
		private AppConfig()
		{
		}
		private static AppConfig a1 = null;
		static AppConfig getInstance()
			{
				if(a1 == null)
				{
					a1= new AppConfig();
				}
			
		
			return a1;
			}
		
	}
class Singleton
	{
		public static void main(String[] args)
		{
			AppConfig a1 =AppConfig.getInstance();
			AppConfig a2 =AppConfig.getInstance();
			AppConfig a3 =AppConfig.getInstance();
		}
	}