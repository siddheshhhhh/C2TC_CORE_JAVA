abstract interface Student
	{
	    abstract void study();
		
	}
abstract interface YouTuber extends VideoEditor
	{
	      int a=10;
	     abstract void makeVideo();
	     default void uploadVideo()
		{
			System.out.println("Upload Video");
		}
	}
interface VideoEditor
	{
		void editVideo();
	}
class Person implements Student , YouTuber
	{
		public static void main(String[] args)
		{
			Person p=new Person();
		//	p.study();
		//	p.makeVideo();
	
			YouTuber y=p;
			p.uploadVideo();
			y.makeVideo();
			y.editVideo();
		}
	public void study()
	{
		System.out.println("Person is Studying");
	}
	public void makeVideo()
	{
		System.out.println("Person is making video");
	}
	public void editVideo()
	{
		System.out.println("Youtuber is editing");
	}
}