package demoPackage;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet doesn't accept duplicate values. 
		//HashSet treeset, LinkedHashSet
		//there is nuarantee eleemtns stored in order. -> random order. 
		//diffrent from List interface class. 
		HashSet<String> hs = new HashSet<String>();
		hs.add("America");
		hs.add("Colombia");
		hs.add("Peru");//deny the duplicate value(s). 
		hs.add("Peru");
		hs.add("Australia");
		hs.add("Argentina");
		hs.add("Brazil");
		System.out.println(hs);
		hs.remove(2);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();//iterator is an interface. 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
