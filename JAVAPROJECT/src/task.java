import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
public void setTitle(String s1)
{
System.out.println("the title is"+" "+s1);
}
}
public class task {
	
	public static void main(String args[])
	{
	String s1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	s1=s.nextLine();
	Book obj=new MyBook();
	obj.setTitle(s1);
	}

	}
	


