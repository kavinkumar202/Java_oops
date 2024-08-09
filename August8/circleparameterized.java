package pack.java;
class Circle{
	private int radius;
    private String color;
     Circle(int radiu,String col) {
    	 this.radius=radiu;
    	 this.color=col;
    	 System.out.print("Radius: "+this.radius + "Color: "+this.color);
}
}

class circleparameterized{
	public static void main(String []agrs) {
		Circle sc=new Circle(1,"Red");
	}
}


