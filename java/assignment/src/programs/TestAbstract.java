package programs;
abstract class File
{
	String fileName;
	int fileSize;
	abstract public void displayInfo();
	abstract public void delete();
}
class VideoFile extends File
{
	String fileFormat;
	public VideoFile(String fileName,int fileSize,String fileFormat)
	{
		this.fileName= fileName;
		this.fileSize= fileSize;
		this.fileFormat= fileFormat;	
	}
	public void displayInfo() 
	{
		System.out.println("File Name :"+fileName);
		System.out.println("File Size :"+fileSize+"Mb");
		System.out.println("File Format :"+fileFormat);
		System.out.println();
	}	
	public void delete() 
	{
		System.out.println("The file "+fileName+" is deleted.");
		System.out.println();
	}	
	public void playFile()
	{
		System.out.println("File "+fileName+" opened in Mediaplayer.");
		System.out.println(fileName+" played in KMplayer");
		System.out.println();
	}
}
class DocumentFile extends File
{
	String docType;
	public DocumentFile(String fileName,int fileSize,String docType)
	{
		this.fileName= fileName;
		this.fileSize= fileSize;
		this.docType= docType;	
	}
	public void displayInfo() 
	{
		System.out.println("File Name :"+fileName);
		System.out.println("File Size :"+fileSize+"Mb");
		System.out.println("File Format :"+docType);
		System.out.println();
	}
	public void delete() 
	{
		System.out.println("The file "+fileName+" is deleted.");
		System.out.println();
	}
	public void openFile()
	{
		System.out.println("File "+fileName+" opened in Editor.");
		System.out.println(fileName+" opened in Ms Excel");
		System.out.println();
	}	
}
public class TestAbstract {
	public static void main(String []args)
	{
		VideoFile mov1=new VideoFile("movie",2341,"Mp4");
		mov1.displayInfo();
		mov1.playFile();
		mov1.delete();
		DocumentFile doc1=new DocumentFile("Doc",12,"Excel");
		doc1.displayInfo();
		doc1.openFile();
		doc1.delete();		
	}
}
