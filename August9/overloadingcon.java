package pack.java;
class add{
	add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	add(double c,double r){
		double d=c+r;
		System.out.println(d);
	}
}

public class overloadingcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj=new add(10,20);
		add ob=new add(10.2,20.5);

	}

}
