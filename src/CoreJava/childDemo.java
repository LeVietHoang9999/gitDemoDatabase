package CoreJava;

public class childDemo extends parentDemo {
	String name ="QAacademy.com";
	public childDemo() {
		super();//invoke the constructor of the parent class. always be the first line
		System.out.println("Child class constructor");
		getStringData();
	}
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
	}
	public void getData() {
		System.out.println("iam child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();//this child object can use all method and variabvle from the parent class. 
		cd.getData();
		cd.getStringData();
	}

}
