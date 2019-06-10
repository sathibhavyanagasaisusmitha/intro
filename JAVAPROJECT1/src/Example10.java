import java.util.*;
public class Example10 {
public static void main(String args[])
	{
	int a,b,c,res;
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter 3 numbers");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    res=a+b+c;
	    if(res>100) {
	    try {
	    throw new Exception("please enter a numbers,whose total is below 100");
	   
	    }catch(Exception e)
	    {
	    System.out.println(e);
	   
	    }
	    }else {
	    System.out.println("welldone"+res);
	    }
	}
}
