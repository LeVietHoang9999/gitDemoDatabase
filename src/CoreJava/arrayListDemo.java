package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class arrayListDemo {
//can accept duplicated values: arrayList, linkedList. Vector - 3 lists implementing List Interface. 
	//array have fixed size where as arraylist grows dynamically. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();//it needs a data type
		//All the collection framework comes under the util package 
		//sending the Integer to the arraylist. 
		a.add("Paris Saint");
		a.add("Manchester United");
		a.add(0,"Tottenham Hosper");
		//System.out.println(a);
//		a.remove(1);
//		a.remove("Manchester United");
		//System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Tottenham Hosper"));
		System.out.println(a.indexOf("Paris Saint"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.remove(0);
		a.stream().forEach(club->System.out.println(club));
		boolean check=a.stream().anyMatch(p->p.contains("Paris Saint"));
		System.out.println(check);
		System.out.println(a.size());
        a.stream().forEach(club->System.out.println(club));
        for (int i=0;i<a.size();i++) {
        	System.out.println(a.get(i)+" "+a.indexOf(a.get(i)));
        }
		List<String> names1 = Arrays.asList("Aronadol","Schannel","FireFoxQueen","Amessi","aBaseball","Ahanni");
		List<String> names = new ArrayList<String>();
		names.add("Tokyo");
		names.add("Fukuoka");
		names.add("Saitama");
		names.add("Akaido");
		Stream<String> connect_list = Stream.concat(names.stream(),names1.stream());
		connect_list.filter(z->z.startsWith("A")).sorted().map(z->z.toUpperCase()).forEach(z->System.out.println(z));

	}

}
