package project9;
import java.util.Scanner;
public class Occurence {
	
		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int c=0;
		char[] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++){
		for(int j=0;j<strArray.length;j++){
		if(strArray[i]==strArray[j]){
		c++;
		}
		}
		System.out.printf("%s :",strArray[i]);
		System.out.printf("%d\n",c);
		c=0;
		}
		}
		}

