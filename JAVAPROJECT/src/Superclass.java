import java.util.*;
public class Superclass {
	
	
	public static void main(String[] args)
	{
	subclass sb=new subclass();
	sb.fun();

	}

	}
	class subclass extends superclass1{
	void fun()
	{
	super.fun();
	System.out.println("Hello I am a motorcycle, I am a cycle with an engine.\r\n" + 
	"My ancestor is a cycle who is a vehicle with pedals");

	}
	}
	class superclass1{
	void fun()
	{
	System.out.println("Hello I am a motorcycle, I am a cycle with an engine.\r\n");
	}

}
