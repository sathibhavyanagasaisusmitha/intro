import java.util.*;
public class Prime {
	
	
	public static void main(String[] args) {
	int n,i,pos,temp,j,count=0,m,s,count1=0;

	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many  numbers");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array elements");
	for(i=0;i<n;i++) {
	a[i]=sc.nextInt();
	}
	pos=0;
	while(pos<n) {

	temp=a[pos];

	       count=0;
	       
	for(j=1;j<=temp;j++) {
	if(temp%j==0) {
	count++;
	}
	}
	if(count==2) {

	System.out.println(temp+"_______________");
	for(m=1;m<=temp;m++) {
	count1=0;
	for(s=1;s<=m;s++) {
	if(m%s==0) {
	count1++;
	}
	}

	if(count1==2) {
	System.out.println(m+"is prime");
	}

	}
	}
	else {
	System.out.println();
	}
	pos++;
	}


	}
}
