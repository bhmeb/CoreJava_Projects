package Java8.Stream2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams8 {

	public static void main(String[] args) throws IOException {

		// 8. Streams row from text file, sort, filter and print

		Stream<String> names = Files.lines(Paths.get("src/names.txt"));
		names.sorted()
		.filter(x -> x.length() > 13)
		.forEach(System.out::println);
		names.close();

		System.out.println();

		// 9. Stream rows from text file and save to List
		
		List<String> names2 = Files.lines(Paths.get("src/names.txt"))
			.filter(x -> x.contains("jit"))
			.collect(Collectors.toList());
		    names2.forEach(x -> System.out.println(x));
		    
		    
	  // 10 Streams rows from CVS file and count
		    
       Stream<String> data = Files.lines(Paths.get("src/data.txt"));
       int rowCount = (int)data
    		   .map(x -> x.split(","))
    		   .filter(x -> x.length == 3)
    		   .count();
       System.out.println(rowCount + " rows. ");
       data.close();
       
       
    // 11. Stream rows from CSV file, parse data from rows
       
    		Stream<String> data2 = Files.lines(Paths.get("src/data.txt"));
    		data2
    			.map(x -> x.split(","))
                .filter(x -> x.length == 3)
    			.filter(x -> Integer.parseInt(x[1]) > 15) //in position 1 if value >15 the print
    			.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
    		data2.close();
    		
      // 12. Stream rows from CSV file, store fields in HashMap
        
    	Stream<String> data3 = Files.lines(Paths.get("src/data.txt"));
    	Map<String, Integer> map = new HashMap<>();
    	map = data3
    	.map(x ->x.split(","))
    	.filter(x ->x.length == 3)
    	.filter(x -> Integer.parseInt(x[1])>15)
    	.collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[1])));
    	data3.close();
    	
    	for(String key : map.keySet()) {
    		System.out.println(key + " " + map.get(key));
    	}
    		
	}
}
