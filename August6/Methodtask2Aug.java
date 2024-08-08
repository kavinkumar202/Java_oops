package pack.java;
 class empName{
	String emp_name="kavin";
	int emp_id=34;
	public void display() {
	
	System.out.println(""+ emp_name);
	System.out.println(""+ emp_id);
}
}
class  Methodtask2Aug {
    public static void main(String[] args) {
    	empName ob = new empName();
        
        ob.display();
    }
}
