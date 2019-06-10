import java.util.Scanner;

public class Average {
	public static void main(String args[])
	{
	int n,i;
	float sum=0,avg;
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of elements");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements");
	for(i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	sum=sum+a[i];
	}

	avg=sum/n;
	System.out.println("Average"+avg);
	}
}


