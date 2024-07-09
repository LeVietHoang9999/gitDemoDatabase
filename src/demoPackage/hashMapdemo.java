package demoPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
	//			Keyvalue, onestring              keyvalue, Take value which gointo that key
	
//	map.put(0, "pencil");
//	map.put(1, "Ruler");
//	map.put(22, "Machine pen");
//	map.put(33, "note book");
//	System.out.println(map.get(33));
//	map.remove(33);
//	System.out.println(map.get(33));
//	Set set1 = map.entrySet();
//	Iterator it = set1.iterator();
//	while(it.hasNext()) {
//		Map.Entry map_call = (Map.Entry) it.next();
//		System.out.println(map_call.getKey());
//		System.out.println(map_call.getValue());
//	}
		map.put(0, "pencil");//put elements -> change to SetEntry -> use Iterator -> hasNext()-> Map.Entry
		map.put(1, "Ruler");
		map.put(22, "Machine pen");
		map.put(33, "note book");
		//phai chuyen no ve iterator
		Set set1 = map.entrySet();
		Iterator hs = set1.iterator();
		while(hs.hasNext()) {
			Map.Entry mp =(Entry) hs.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
