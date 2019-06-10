
public class Example4 {
	public static void main(String args[])
	{
	try {

	int a=10;
	int b=0;
	int c=a/b;
	int arr[]=new int[5];
	System.out.println(arr[10]);

	}
	catch(ArithmeticException e) {
	System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	}
	finally {
	System.out.println("end of program");
	}
	}
}
