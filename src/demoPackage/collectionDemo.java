package demoPackage;

import java.util.ArrayList;

public class collectionDemo {
	int speedLimit = 20;
	
	public static void main(String[] args) {
		//printing the unique number in the collection
		int a[] = {4,4,5,5,5,6,6,9,5,5,7,9,9};
		//4 repeats 2 times, 5 - 5,6 -2, 7 - 1, 9-3
		ArrayList<Integer> al = new ArrayList<Integer>();
		//print the number of appearance in array a[];
		for (int i=0;i<a.length;i++) {
			int k =0; //to calculate the number appear
			if(!al.contains(a[i])) {
				k++;
				al.add(a[i]);
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						k++;
						//System.out.println(al.get(i));
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
			}
			
			

		}
	}

}
