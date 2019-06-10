import java.util.Scanner;
class AgeGreaterException extends Exception
{
   
   AgeGreaterException(String s)
    {
   super(s);
}
}
public class Example12 {
	 public static void main(String[] args) { 
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter age");
	       int n = sc.nextInt();
	       try
	       {
	         check_age(n);
	         
	       }
	       catch(AgeGreaterException e)
	       {
	           System.out.println(e);
	       }
	   }

	   private static void check_age(int n)throws AgeGreaterException {
	     
	       if(n>18)
	       {
	           System.out.println(n+"is greater than 18");
	           
	       }
	       else
	           throw new  AgeGreaterException("'Access denied - You must be at\r\n" +
	                   "least 18 years old.'");
	   }
}
