package project9;
import java.util.Scanner;
public class Circle {
public static void main(String[] args)
{
	
	int n,r,i=0,j;
	Scanner s=new Scanner(System.in);
    int a[]=new int[10];
	System.out.println("enter a value:");
	n=s.nextInt();
	while(n>=1)
	{
		r=n%2;
		a[i]=r;
		n=n/2;
		i++;
	}
	for(j=i;j>=0;j--)
	{
		System.out.println(a[j]);

	}
}
}
