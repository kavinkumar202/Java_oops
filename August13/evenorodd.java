package pack.java;
import java.util.*;
public class evenorodd{
	public static void main(String[]agrs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		if(i%2!=0) {
			System.out.println(i);
	}
	}
	System.out.println("This is a even number" );
	for(int i=1;i<=a;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
}