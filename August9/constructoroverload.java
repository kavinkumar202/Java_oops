package pack.java;
class Student1{
	Student1(String name,int rollNo)
	{
		System.out.println("Name : "+name+" "
				+" RollNo :" + rollNo);
	}
	Student1(int rollNo,String name,int ph) {
		System.out.println("Name : " + name +" "
				           + "RollNo"+rollNo+"Phone Number"+ph);
	}
 
Student1(int rollNo,String name,int pho,int age){
	System.out.println("Name: "+ name + "rollNo :" + rollNo +"Phone"+ pho+ "Age:"+age);	
}
 
}
public class constructoroverload  {

	public static void main(String[] args) {
		Student1 s1 = new Student1("kavin",1);
		Student1 s2 = new Student1(2,"kavin",1234567);
		Student1 s3 = new Student1(3,"kavin",16654321,23);
      
		
	}

}





