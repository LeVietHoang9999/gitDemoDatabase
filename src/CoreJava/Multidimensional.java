package CoreJava;

public class Multidimensional {
	public static void main(String[] arg) {
		int ar1[][] = new int[2][3]; //row first, column second 2 4 5 
															//	3 4 7
		ar1[0][0]=2;
		ar1[0][1] = 4;
		ar1[0][2] = 5;
		ar1[1][0]=3;
		ar1[1][1] = 4;
		ar1[1][2] = 7;
		//System.out.println(ar1[1][1]);
		int ar2[][]= {{2,4,5},{3,4,7},{1,2,6}};//find the min number
		int min=ar2[0][0];
		int min_column = 0;
		int l=0;
		int k = 3;
		//System.out.println(ar2[0][2]);
		for (int row=0;row<ar2.length;row++) {
			
			for (int col=0;col<ar2[row].length;col++) {
				if (ar2[row][col]<min) {
					min = ar2[row][col];//min da duoc gan gia tri
					min_column = col;
				}
				
			}
		}
		System.out.println(min);
		System.out.println(min_column);
		//System.out.println(min);
		//tim ra so lon nhat trong column co chua so nho nhat. 
		int max=ar2[0][min_column];
		while(l<3) {//khi nay k = 2;
			if(ar2[l][min_column]>max) {
				max = ar2[l][min_column];
			}
			l++;
		}
		System.out.println(max);
	}
}
 