package pack.java;
class student{
	String name;
	int  RollNumber ;
	double marks;
	
	student(String na,int  Roll,double mark){
	name=na;
	RollNumber=Roll;
	marks=mark;
	
	System.out.println("Name: "+name);
	System.out.println("RollNumber: "+	RollNumber);
	System.out.println("Marks: "+marks);
	}
}

public class studentparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ob=new student("kavin" ,25,80.07);
		
	}

}
