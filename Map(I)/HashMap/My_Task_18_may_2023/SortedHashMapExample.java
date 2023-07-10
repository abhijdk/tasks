package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedHashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("c", 2);
        hashMap.put("d",1);
        hashMap.put("a", 4);
        hashMap.put("b",3);
        
        TreeMap<String, Integer> tree=new TreeMap<>(hashMap);
        
        System.out.println("Sorted element's are " +tree);
        }
}
