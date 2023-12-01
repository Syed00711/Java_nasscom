package DataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		HashMap<Long,String> hm =new HashMap<>();
		LinkedHashMap<Long,String> hm2 =new LinkedHashMap<>();
		TreeMap<Integer,Character> hm3 =new TreeMap<>();
		hm3.put(3, '^');
		hm3.put(4, 'a');
		hm3.put(1, 'v');
		hm3.put(2, '@');
		System.out.println(hm3.descendingMap());
		
		
		hm.put(3123L, "one");
		hm.put(3122L, "one");
		hm.put(3121L, "one");
		hm.put(3124L, "one");
		hm.put(3128L, "one");
System.out.println(hm.toString());
System.out.println(hm.getOrDefault(3123L,"zero"));
System.out.println(hm.keySet().toString());
System.out.println(hm.values().toString());


for(Entry<Long,String> ss: hm.entrySet()) {
	System.out.print(ss.getKey());
	System.out.print("=========");
	System.out.println(ss.getValue());
}

hm.forEach((k,v)  ->{System.out.println(k+"--------"+v);});

	}

}
