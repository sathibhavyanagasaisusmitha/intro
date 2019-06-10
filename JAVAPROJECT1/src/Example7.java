import java.io.IOException;
	import java.util.*;
	
public class Example7 {
	
	public static void main(String args[])
	{
	int n;
	System.out.println("enter a number");
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    try {
	    if(n<18) {
	    n();
	   
	    }
	    System.out.println("you are accessible");
	   
	   
	   
	    }
	    catch(IOException e)
	    {
	    System.out.println(e);
	    }
	   
	}

	private static void n() throws IOException {
	// TODO Auto-generated method stub
	throw new IOException("Access denied - You must be atleast 18 years old.");
	}
}
