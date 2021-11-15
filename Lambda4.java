package lambda;

import java.util.*;

public class RemoveQ4 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("kumar");
		l.add("laksmi");
		l.add("raashi");
		l.add("cap");
		l.add("Jgemin");
		l.add("Naresh");
		System.out.println("Before using the removeIf "+l);
		l.removeIf(name->name.length()%2!=0);
		System.out.println("After using the removeIf "+l);
		
	}

}