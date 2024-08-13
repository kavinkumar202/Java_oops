package pack.java;

 class Stu{  
	   int rollno;
	   String name;  
	   static String college ="ITS";
	    
	   Stu(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }  
	}  
		public class staticvaraibl{  
	 public static void main(String args[]){  
	 Stu s1 = new Stu(111,"Karan");  
	 Stu s2 = new Stu(222,"Aryan");  
	 s1.display();  
	 s2.display();  
	 }  
	}  