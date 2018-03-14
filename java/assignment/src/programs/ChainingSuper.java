package programs;

class Video
{
	String name;
	int size;
	String fileFormat;
	public Video(String name,int size,String fileFormat)
	{
		this.name=name;
		this.size=size;
		this.fileFormat=fileFormat;
	}
	
}
class Movie extends Video
{
	String genre;
	String rYear;
	public Movie(String name,int size,String fileFormat,String genre,String rYear)
	{
		super(name,size,fileFormat);
		this.genre= genre;
		this.rYear= rYear;	
	}
	
	public void infoDisplay()
	{
		System.out.println("Name of video is : "+name);
		System.out.println("Size of "+name+" is : "+size+"Mb");
		System.out.println("Fileformat of "+name+" is : "+fileFormat);
		System.out.println("Genre of "+name+" is : "+genre);
		System.out.println("Release year of "+name+" is : "+rYear);
	}
	
}

public class ChainingSuper {
	public static void main(String []args)
	{
		Movie m1=new Movie("Avenger",1564,"MKV","Action","2014");
		m1.infoDisplay();
		System.out.println();
		Movie m2=new Movie("3 Idiots",2345,"Mp4","Drama","2016");
		m2.infoDisplay();
		
	}

}
