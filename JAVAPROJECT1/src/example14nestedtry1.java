
public class example14nestedtry1 {
	public static void main(String args[]){  
		 try{  
		   try{  
		   
		    try{  
		    System.out.println("going to divide");  
		    int b =39/0;
		    int a[]=new int[5];  
		        a[5]=4;
		         
		    }
		    catch(ArithmeticException e) {
		  System.out.println(e);
		  }  
		   }
		   catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println(e);
		  }
		 }
		 
		   
		 
		 
		 catch(Exception e){
		 System.out.println("handeled");
		 }
		 finally {
		 System.out.println("normal flow..");  
		 System.out.println("finally block");
		 }

		}
}
