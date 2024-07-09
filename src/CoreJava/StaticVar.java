package CoreJava;

public class StaticVar {
	String name;//instance variable
	String address;
	static String city="Bangkok";
	int i=0;
	static int a;
	static String country;
	static {
		a = 2;
		country = "Thailand";
	}
	StaticVar(String name, String address){
		this.name = name;
		this.address = address;
		a++;
		i++;
		System.out.println(Integer.toString(a)+", "+Integer.toString(i));
	}
	public void getAdress() {
		System.out.println(name+" "+address+" "+city+" "+country);//static variable can't be called in object. only instance method, staic method or the class. 
	}
	public static void getCity() {
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar.getCity();
		StaticVar var = new StaticVar("Messi","120BaDinh");//instance variable goi trong object. 
		StaticVar var1 = new StaticVar("Ronaldo","50CauGiay");
		var.getAdress();//static variable dc goi qua classs jhoac goi trong method, or static method. 
		var1.getAdress();
		
	}

}
