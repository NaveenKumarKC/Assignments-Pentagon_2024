class PhotoShop
{
   public void openFile(SysFile fp){
	   fp.displayFileInfo();
		if(fp instanceof jpgFile) 
		{
		   ((jpgFile) fp).fileBehavior();
		}
		else if (fp instanceof pngFile) 
		{
			((pngFile) fp).fileBehavior();
		}
		else if (fp instanceof pdfFile)
		{
			((pdfFile) fp).fileBehavior();
		}


   }
}
class SysFile
{
	String file_name;
	String file_extn;
	long file_size;
	SysFile(String file_name, String file_extn, long file_size)
	{
		this.file_name=file_name;
		this.file_extn=file_extn;
		this.file_size=file_size;
	}
	void displayFileInfo()
	{
		System.out.println("File name is "+file_name);
		System.out.println("File Extension is "+file_extn);
		System.out.println("File Size is "+file_size);
	}
}
class jpgFile extends SysFile
{

	jpgFile(String file_name, String file_extn, long file_size) {
		super(file_name, file_extn, file_size);
	}
	void displayFileInfo()
	{
		System.out.println("File name is JPG ");
	}
	void fileBehavior()
	{
		System.out.println("Displayed as flat file ");
	}
}
class pdfFile extends SysFile
{

	pdfFile(String file_name, String file_extn, long file_size) {
		super(file_name, file_extn, file_size);
	}
	void displayFileInfo()
	{
		System.out.println("File name is PDF ");
	}
	void fileBehavior()
	{
		System.out.println("Displayed as document with layers");
	}
	
}
class pngFile extends SysFile
{

	pngFile(String file_name, String file_extn, long file_size) {
		super(file_name, file_extn, file_size);
		
	}
	void displayFileInfo()
	{
		System.out.println("File name is PNG ");
	}
	void fileBehavior()
	{
		System.out.println("Displayed as image file with layers");
	}
	
}

public class OperatingSystem {

	public static void main(String[] args) {
		SysFile jpg= new SysFile("potrait","jpg",100);
		SysFile pdf= new SysFile("Marks Card","pdf",1024);
		SysFile png= new SysFile("Screenshot","png",512);

		PhotoShop ps = new PhotoShop();
		ps.openFile(jpg);
		ps.openFile(png);
		ps.openFile(pdf);	
	}

}
