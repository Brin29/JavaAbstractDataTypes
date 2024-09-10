package setAndList;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class setAndList {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		
		set.add("Hola");
		list.add("Adios");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		for (String s : list) {
			System.out.println(s);
		}
		

	}

}
