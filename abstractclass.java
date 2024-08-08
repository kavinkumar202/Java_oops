package pack.java;

abstract class Animal
{
	abstract void sound();
}
class lion extends Animal
{
	void sound() {
		System.out.print("Loins Sound");
		}
}
class tiger extends Animal{
	void sound() {
		System.out.print("Tiger Sound");
	}
}
class abstractclass{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
         Animal ob=new lion();
         
         ob.sound();
         
	}

}
