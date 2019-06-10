import java.util.*;
public class  sort  {
	public static void main(String args[])
	{
	   int i,n,j,temp;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter array size");
	  n=sc.nextInt();
	   System.out.println("enter array elements");
	   int a[]=new int[10];
	    for(i=0;i<n;i++)
	    {
	    a[i]=sc.nextInt();
	    }
	   for(i=0; i<n-1; i++)
	   {
	         
	       for(j=0; j<n-i-1; j++)
	       {
	          if(a[j]>a[j+1])
	          {
	          temp=a[j];
	          a[j]=a[j+1];
	          a[j+1]=temp;
	  }

	       }
	     
	   }
	  System.out.println("elements are:");
	 

	   for(i=0; i<n; i++)
	   {
	     System.out.println(a[i]);
	   }
	   
	}

	}