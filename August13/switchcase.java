package pack.java;
import java.util.*;
public class switchcase {
		public static void main(String[] args) {			
			Scanner sc = new Scanner(System.in);			
			System.out.println("enter the number a : ");
			int a = sc.nextInt();			
			System.out.println("enter the number b : ");
			int b = sc.nextInt();			
		    System.out.println("Enter the Operation you want to perform : ");
			String operations = sc.next();			
			switch(operations)
			{		
			    case "add":
			    	System.out.println("The Sum is : "+(a+b));
			      break;
			       
			    case "sub":
			    	System.out.println("The Sum is : " +(a-b));
			       break;
			       
			    case "multiply":
			    	System.out.println("The Sum is : " +(a*b));
			       break;
			       
			    case "division":
			    	System.out.println("The Sum is : " +(a/b));
			       break;
			    default:
			    	System.out.println("Invalid input");
			
			}
		}
}
