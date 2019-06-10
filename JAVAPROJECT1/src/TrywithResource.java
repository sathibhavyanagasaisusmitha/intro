import java.io.*;    
public class TrywithResource {
	
	
	public static void main(String args[]){      
	       
	try(FileOutputStream fileOutputStream =new FileOutputStream( "/C:\\lavanya572\\New folder/a.txt"))
	{      
	String msg = "Welcome ";      
	byte byteArray[] = msg.getBytes();   
	fileOutputStream.write(byteArray);  
	System.out.println("Message written to file successfuly!");      
	}
	catch(Exception exception){  
	       System.out.println(exception);  
	}      
	}      
}
