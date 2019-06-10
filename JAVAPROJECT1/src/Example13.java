import java.util.*;
public class Example13 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	int len=str.length();
	try {
	checklength(len);
	}
	catch(LengthGreaterThanException e) {
	System.out.println(e);
	}
	}
	static void checklength(int l) throws LengthGreaterThanException{
	if(l>15) {
	throw new LengthGreaterThanException("please enter shorter name");
	}else {
		System.out.println("Name is okay");

	}
	}

	}


	class LengthGreaterThanException extends Exception{
	LengthGreaterThanException(String sd){
	super(sd);
	}
}
