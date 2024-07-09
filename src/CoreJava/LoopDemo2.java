package CoreJava;

public class LoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1; 
		int b = 1;
		for(int i =1;i<=4;i++) {
			//run 4 loops
			
			for (int j=1;j<=b;j++) {
				System.out.print(Integer.toString(j)+"\t");
				a++;
			}
			System.out.print("\n");
			b++;
		}
	}

}
