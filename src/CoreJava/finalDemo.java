package CoreJava;

public class finalDemo {
	public String name;
	static String name1="Australia";
	static int i =0;
	static String country="Halan";
	finalDemo(){
		
		System.out.println(name1);
		i++;
		System.out.println(i);
		System.out.println(country);
		
	}
	final public void getData(String name) {
		System.out.println("Final method with the dynamic name: "+name);
	}
	public void getData(int a) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalDemo fd = new finalDemo();//truyen value vao trong ngoạc của object. 
		finalDemo fd1 = new finalDemo();
		
		fd.getData("Ronaldo");
	}

}
