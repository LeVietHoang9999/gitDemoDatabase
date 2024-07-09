package demoPackage;

import CoreJava.classA;
import CoreJava.parentDemo;
import CoreJava.thisDemo;
//import package.classname
public class demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classA ca = new classA();
		thisDemo thisDemo = new thisDemo();//create new instance of the object thisDemo
		thisDemo.abc();
		//parentDemo pd = new parentDemo();
		
		demo1 d1 = new demo1();
		parentDemo pd= new parentDemo();
		pd.getStringData();
		//this is the power of the protected. can't be use in another package. only use in the same package or other package if it inherits the parent class. 
	}
	protected void getDatademo1() {
		System.out.println("this is the demo1 class");
	}
	//default modifierL access method anywhere in package. 
	

}
