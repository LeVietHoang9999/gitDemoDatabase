package CoreJava;

public class thisDemo {
	//This keyword bring us value from the class level. 
	int a =2;
	public thisDemo() {
		getData();
	}
	public void getData() {
		int a =3;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(a+this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td = new thisDemo();
	}
public void abc() {
		
	}

}
