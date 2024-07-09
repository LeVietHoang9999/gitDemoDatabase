package CoreJava;

public class whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		int j=20;
		do {
			System.out.println(j);
			j++;
		}while(j>30);
		for (int i =0;i<=10;i+=3) {
			System.out.println(i);
			if(i==9) {
				System.out.println("found the number 9");
			}
			
		}
		thisDemo td = new thisDemo();
		System.out.println(td.a);
	}

}
