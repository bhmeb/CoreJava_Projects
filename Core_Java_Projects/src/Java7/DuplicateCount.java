package Java7;

	import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

	public class DuplicateCount {

		public static void main(String[] args) {
			
			ArrayList<String> arr = new ArrayList<>();
			arr.add("a");
			arr.add("a");
			arr.add("b");
			arr.add("c");
			arr.add("c");	
			arr.add("c");
			arr.add("d");
			arr.add("d");
			arr.add("e");
			arr.add("f");
			
			
			//Example1
			System.out.println("Count 'a' with frequency");
			System.out.println("a: "+ Collections.frequency(arr, "a"));
			
			//Example2
			System.out.println("Count of all with frequency");
			HashSet<String> unique = new HashSet<String>(arr);
			for(String temp : unique) {
				System.out.println(temp +":"+ Collections.frequency(arr, temp));
			}
			
			//Example3
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(String temp:arr) {
				Integer count = map.get(temp);
				map.put(temp, (count==null) ? 1 : count+1);
	     	}
			
			pringMap(map);
			

		}

		public static void pringMap(HashMap<String, Integer> map) {
	    
			for(Map.Entry<String, Integer> entry: map.entrySet()) {
				System.out.println("Key : " + entry.getKey() + "  Value : "+ entry.getValue());
			}
			
		}

	}

