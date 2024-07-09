package Test;

public class PS2 extends PS3 {
	int a;
	public PS2(int a2) {// su dung default constructor thi chi can 1 biet global la dc
		super(a2);//parent class is invoked. 
		this.a = a2;//child class constructor
	}
	public int increment() {
		a =a +1;
		return a;
	}
	public int decrement() {
		a = a-1;
		return a;
	}
}
