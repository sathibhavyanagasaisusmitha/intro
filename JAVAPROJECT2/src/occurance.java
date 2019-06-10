import java.util.Scanner;
public class occurance
{
public static void main(String args[]){
	int count=0;
	char p;
	char a;
	String s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			s=sc.nextLine();
			System.out.println("enter a char");
			a=sc.next().charAt(0);
			for(int i=0;i<s.length();i++){
			p=s.charAt(i);
			if(p==a){
			count++;
			}
			}
			System.out.printf(a+"is found"+count+"times");
			
			}
			}
