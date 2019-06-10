
import java.util.Scanner;
class stringclass {
void substring(String s1,int x,int y)
{
StringBuffer sb=new StringBuffer(s1);
for(int i=x;i<y;i++) {
System.out.print(sb.charAt(i));
}
}
}
public class Mainclass4 {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[2];
	int n1,n2;
	String s;
	System.out.println("enter a string");
	s=sc.nextLine();
	System.out.println("enter index values");
	for(int i=0;i<2;i++)
	{
	a[i]=sc.nextInt();

	}
	n1=a[0];
	n2=a[1];
	stringclass s1=new stringclass();
	s1.substring( s, n1, n2);
	}

	}