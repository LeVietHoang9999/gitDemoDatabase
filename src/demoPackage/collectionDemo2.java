package demoPackage;

import java.util.ArrayList;

public class collectionDemo2 extends collectionDemo {
	int speedLimit = 50;
	private demo1 d1;
	private exceptionDemo d2;
	public collectionDemo2() {
		d1 = new demo1();
		d2= new exceptionDemo();
		//this, super. 
	}
	public void methodDemo1() {
		d1.getDatademo1();
	}
	public void methodException() {
		d2.getDataexceptiondemo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {2,3,3,2,3,2,5,5,6,7,6,6};
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		//de ma loc dc ra tung unique number thi do data tu array sang array list. 
//		for(int i =0;i<a.length;i++) {
//			int k=0;//local var. 
//			if(!al.contains(a[i])) {//dam bao la no k add them duplicate data. 
//				k++;
//				al.add(a[i]);
//				//them vao r thi bay gio dung k++ de dem so lan lap
//				for(int j=i+1;j<a.length;j++) {
//					if(a[i]==a[j]) {
//						k++;
//						
//					}
//				}
//	}
//}
//				//khi nay k va al deu dang co gia tri
//				System.out.println(a[i]);
//				System.out.println(k);
		collectionDemo2 cd = new collectionDemo2();
		//constructor se thay the cho default object. khi goi ra la toan bo phuong thuc trong constructor se run. 
		collectionDemo cd2 = new collectionDemo2();
		System.out.println(cd2.speedLimit);//neu ta dung 2 methods cung ten trong parent va child thi se overriding ngay. 
		// neu k goi cung ten method thi se k co dahinh tai runtime. 
//		cd.d1.getDatademo1();
//		cd.d2.getDataexceptiondemo();
		cd.methodDemo1();
		cd.methodException();
			
	}

}
