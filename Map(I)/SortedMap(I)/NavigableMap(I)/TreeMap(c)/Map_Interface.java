/*
 * Storing data In TreeMap 
 * playing with Predefine Method's
 */
import java.util.Map;
import java.util.TreeMap;

public class Map_Interface {
	public static void main(String[] args) {
		Map<Object, Object> tm=new TreeMap<Object, Object>();
		tm.put("a", 4.7);
		tm.put("b", "3");
		tm.put("d", "1");
		tm.put("e", "3");
		tm.put("c", "4");
		tm.put("b", "33");
		

		Map<Object, Object> tm1=new TreeMap<Object, Object>();
		tm1.put("Abhi", "353");
		tm1.putAll(tm);
		tm.remove("b");
		tm.remove("b", "33");
		System.out.println(tm.replace("b", "333")+"\n");
		tm.replace("b", "333");
		tm1.forEach((k,v)->System.out.println(k+ " "+v));
		System.out.println(tm1.size());
//		tm1.clear();
		System.out.println(tm1);
		System.out.println(tm1.isEmpty());
		
		System.out.println(tm1.containsValue("313"));
		System.out.println(tm1.get("ac"));
		System.out.println(tm1.getOrDefault("ab", "Key not aval"));
		System.out.println();
		tm1.putIfAbsent("Abhinna", tm1);
		System.out.println(tm1);
	}

}
