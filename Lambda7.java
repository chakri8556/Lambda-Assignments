package lambda;

import java.util.*;

public class KeyValueQ7 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "kuamr");
		m.put(2, "lakshmi");
		m.put(3, "ravi");
		m.put(4, "Sauske");
		m.put(5, "Itachi");
		System.out.println(m.entrySet());
		StringBuilder mapAsString = new StringBuilder();
		for(Integer key:m.keySet()) {
			mapAsString.append(m.get(key));
		}
		System.out.println(mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append(""));
		
		
	}
	
}