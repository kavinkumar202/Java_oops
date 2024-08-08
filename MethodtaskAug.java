package pack.java;

public class MethodtaskAug {
int a=10;
int b=20;
int c=0;
public void Add() {
	c=a+b;
	System.out.println(c);
}
public void Sub() {
	c=a-b;
	System.out.println(c);
}
public void Multi() {
	c=a*b;
	System.out.println(c);
}
	public static void main(String[] args) {
		
		MethodtaskAug obj=new MethodtaskAug();
		obj.Add();
		obj.Sub();
		obj.Multi();
	}

}
