import java.util.*;
public class Mainclass {
	
	
	public static void main(String args[])
	{
	Sports obj1=new Sports();
	Sports obj=new Soccer();
	obj1. getNumberOfTeamMembers();
	obj.getNumberOfTeamMembers();
	}

	}
	class Sports{
	   String getName(){
	        return "Generic Sports";
	    }
	    void getNumberOfTeamMembers(){
	    System.out.println("Generic sports");
	        System.out.println( "Each team has n players in " +getName() );
	    }
	}
	class Soccer extends Sports
	{
	String getName(){
	        return "Soccer Class";
	    }
	        void getNumberOfTeamMembers()
	        {
	        System.out.println("Soccer");
	            System.out.println( "Each team has 11 players in " + getName() );
	        }
	    }


