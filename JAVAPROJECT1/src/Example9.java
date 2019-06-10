import java.util.*;
public class Example9 {

	public static void main(String args[]) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter a name");
	     String str=s.nextLine();
	     int len=str.length();
	    try { if(len>15) {
	    throw new ArithmeticException("please enter shorter name");
	     }
	    System.out.println("name is okay");}
	     catch(ArithmeticException e)
	     {
	    System.out.println(e);
	     }
	}


}
