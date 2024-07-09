package CoreJava;

public class constructorDemo {
	
	//constructor: will not return value
	//name of constrictor shjould be the class name
	//Default constructor - always run instead of para constructor
	public constructorDemo() {
		System.out.println("This is the constructor");
	}
	//Parameterized constructor
	public constructorDemo(int a, int b) {//no need to return in the constructor
		System.out.println("this is the parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	public constructorDemo(String str) {//no need to return in the constructor
		System.out.println(str);
	}
	public void getData() {
		System.out.println("this is the method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructorDemo cd = new constructorDemo();
		constructorDemo c = new constructorDemo(4, 5);
		constructorDemo cd = new constructorDemo("Hello");
		
		//when you create an object, the constructor is called. 
		
		//the compiler will call the default (implicit) constructor  if you haven;t defined constructor
	}

}
