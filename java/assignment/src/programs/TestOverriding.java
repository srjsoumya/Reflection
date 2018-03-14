package programs;

class Vdeo
{
	String name;
	int size;
	String fileFormat;
	public Vdeo(String name,int size,String fileFormat)
	{
		this.name=name;
		this.size=size;
		this.fileFormat=fileFormat;
	}
	public void infoDisplay()
	{
		System.out.println("Name of video is : "+name);
		System.out.println("Size of "+name+" is : "+size+"Mb");
		System.out.println("Fileformat of "+name+" is : "+fileFormat);
		
	}	
}
class MovieFile extends Video
{
	String genre;
	String rYear;
	public MovieFile(String name,int size,String fileFormat,String genre,String rYear)
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
class SongVideo extends Video
{
	String sName;
	String mType;
	public SongVideo(String name, int size, String fileFormat,String sName,String mType) 
	{
		super(name, size, fileFormat);
		this.sName=sName;
		this.mType =mType;
	}
	public void infoDisplay()
	{
		System.out.println("Name of video is : "+name);
		System.out.println("Size of "+name+" is : "+size+"Mb");
		System.out.println("Fileformat of "+name+" is : "+fileFormat);
		System.out.println("Singer Name of "+name+" is : "+sName);
		System.out.println("Music type of "+name+" is : "+mType);
	}	
}
public class TestOverriding {
	public static void main(String []args)
	{
		Vdeo m1=new Vdeo("Avenger",1564,"MKV");
		m1.infoDisplay();
		System.out.println();
		Movie m2=new Movie("3 Idiots",2345,"Mp4","Drama","2016");
		m2.infoDisplay();
		System.out.println();
		SongVideo s1=new SongVideo("24Caret",124,"Mp4","Bruno mars","Pop");
		s1.infoDisplay();
	}
}
