import java.io.FileOutputStream; 
public class Trywithresource2 {
	   
	 
	public static void main(String args[]){      
	try(    FileOutputStream fileOutputStream=  new FileOutputStream("/C:\\lavanya572\\New folder/a.txt")){  
	   
	        String msg = "Welcome ";      
	        byte byteArray[] = msg.getBytes();        
	        fileOutputStream.write(byteArray);  
	        System.out.println("Data written successfully!");  
	}catch(Exception exception){  
	       System.out.println(exception);  
	}  
	finally{  
	       System.out.println("Finally executes after closing of declared resources.");  
	}  
	}      
	}  

