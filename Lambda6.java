package lambda;

import java.util.ArrayList;
import java.util.List;

public class ReplaceQ6 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("raju");
		l.add("sai");
		l.add("kiran");
		l.add("jlaxmio");
		l.add("ashok");
		l.replaceAll(s->s.toUpperCase());
		System.out.println(l);
	}

}