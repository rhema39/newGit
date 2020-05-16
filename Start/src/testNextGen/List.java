package testNextGen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ArrayList	
		/*ArrayList<String> al = new ArrayList<String>();
		al.add(null);
		al.add("sonu");
		al.add("lalit");
		al.add("nonu");
ListIterator<String> itr =al.listIterator();
while(itr.hasNext()){
	System.out.println(itr.next());
	System.out.println(itr.previous());
}*/
		
	/*TreeSet<String> al=new TreeSet<String>();
		al.add(null);
		al.add("sonu");
		al.add(null);
		al.add("nonu");
		
		//Iterator<String> itr = al.descendingIterator();
		for (String string : al) {
			System.out.println(string);
		}*/
		
		HashMap<String,String> al =new HashMap<String,String>();
		al.put("h","hema");
		al.put("n", "nonu");
		al.put(null, "lalit");
		al.put(null, "sonu");
		
	
			System.out.println(al);
			
			for(Map.Entry m: al.entrySet()){
				System.out.println(m.getKey() +" "+ m.getValue());
			}
		}
	}


