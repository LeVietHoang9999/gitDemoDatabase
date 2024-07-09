package CoreJava;

public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i =1;i<=4;i++) {
//			System.out.println("Start outter loop");
//			for (int j =1;j<=4;j++) {
//				System.out.println("Inner loop");
//			}
//			System.out.println("Close outter loop");
//		}
		int a=1;
		int b=4;
		for (int i =1;i<=4;i++) {//loop 4 times
			
			for (int j =1;j<=b;j++) {
				System.out.print(Integer. toString(a));
				System.out.print("\t");
				a++;
			}
			b--;
			System.out.print("\n");
		}
	}

}
