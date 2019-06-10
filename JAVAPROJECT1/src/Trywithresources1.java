import java.io.DataInputStream;  
	import java.io.FileInputStream;  
	import java.io.FileOutputStream;  
	import java.io.InputStream;   
public class Trywithresources1 {
	 
	  
	public static void main(String args[]){      
	       
	try(     
	        FileOutputStream fileOutputStream =new FileOutputStream("/C:\\lavanya572\\New folder/a.txt");  
	        InputStream input = new FileInputStream("/C:\\lavanya572\\New folder/a.txt")){  
	        
	        String msg = "Welcome";      
	        byte byteArray[] = msg.getBytes();       
	        fileOutputStream.write(byteArray);    
	        System.out.println("------------Data written into file--------------");  
	        System.out.println(msg);  
	      
	        DataInputStream inst = new DataInputStream(input);    
	        int data = input.available();    
	         
	        byte[] byteArray2 = new byte[data];    
	        inst.read(byteArray2);    
	        String str = new String(byteArray2);  
	        System.out.println("------------Data read from file--------------");  
	        System.out.println(str); 
	}catch(Exception exception){  
	       System.out.println(exception);  
	}     
	}      
	}  

