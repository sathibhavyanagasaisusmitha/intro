import java.util.*;
public class Example11 {
public static void main(String args[])
	{
	int a,b,c,res;
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	res=a+b+c;
	if(res>100) {
	try {
	throw new SumGreaterthanException("please enter numbers,whose total is greater than 100");
	} catch(SumGreaterthanException e) {
	System.out.println(e);
	}
	}else {
	System.out.println("well done"+res);
	}
	}

	}

	class SumGreaterthanException extends Exception{
	SumGreaterthanException(String s)
	{
	super(s);
	}
}
