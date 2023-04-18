package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Shyam");hs.add("Narwade");hs.add("Panshewadi");hs.add("Kandhar");hs.add("Nanded");
		hs.add("Shyam");hs.add("Nanded");hs.add(null);
		System.out.println(hs);
		System.out.println(".........................................");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("..........................................");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Shyam");lhs.add("Narwade");lhs.add("Panshewadi");lhs.add("Kandhar");lhs.add("Nanded");
		lhs.add("Shyam");lhs.add("Nanded");lhs.add(null);
		System.out.println(lhs);
		
		System.out.println("...................................................");
		
		TreeSet<String> tr= new TreeSet<>();
		tr.add("Shyam");tr.add("Narwade");tr.add("Panshewadi");tr.add("Kandhar");tr.add("Nanded");
		tr.add("Shyam");tr.add("Nanded");tr.add("Tree");tr.add("Asending");
		System.out.println(tr);
		System.out.println(".........................................");
		
	}

}
