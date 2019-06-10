import java.util.Scanner;
public class Example8 {
	public static void main(String args[])
		{
			String array[]=new String[20];
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number of  Strings: ");
			int n=s.nextInt();
			System.out.println("The strings are:");
			for(int i=0;i<=n;i++) 
			{
				array[i]=s.nextLine();
			}
			System.out.println("Enter the strings  u want to check:");
			String name=s.nextLine();
			boolean contains =false;
			for(int j=1;j<=n;j++)
			{
			if(array[j].equals(name))	
				
			{
				contains=true;
			    break;
			}
			}
			try
			{
				if(contains)
				{
					System.out.println(" the present name in the array of string");
				}
				else
				{
				throw new Exception(" 'Access denied - 'You are not Enrolled for the\r\n" + 
						"class'.'");
					}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}


