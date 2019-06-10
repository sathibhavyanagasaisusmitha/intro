import java.util.*;
public class interface1 {
	
	
	public static void main(String args[]) {
	int n1,res;
	System.out.println("enter a value");
	Scanner s=new Scanner(System.in);
	n1=s.nextInt();
	Mycalculator obj=new Mycalculator();
	res=obj.divisor_sum(n1);
	System.out.println("sum is:"+res);
	}

	}
	interface Advancedarithmetic{
	int divisor_sum(int n);
	}
	class Mycalculator implements Advancedarithmetic{
	public int divisor_sum(int n)
	{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	sum=sum+i;
	}
	}
	return sum;
	}
}
