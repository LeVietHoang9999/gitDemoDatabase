package CoreJava;

public class parentDemo {
	String name ="Cristiano";
	public parentDemo() {
		System.out.println("Parent class constructor");
	}
	public void getData() {
		System.out.println("Iam parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void getStringData() {
		System.out.println("This is the protected method, user needs to inherit to this class to use");
	}

}
