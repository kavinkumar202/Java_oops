package pack.java;

public class instantvaraible {
	String name;
	int age;
	
	void display() {
		name="kavinkumar";
		age=21;
		System.out.println("Name:" + name);
		System.out.println("Age :" + age);
	}
	void display2(String n,int ag) {
		name=n;
		age=ag;
		System.out.println("Name:" + name);
		System.out.println("Age :" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		instantvaraible obj=new instantvaraible();
		obj.display();
		obj.display2("kavin",22);
		
	}

}
