package in.biswa.mapToList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapToList {
	public static void main(String[] args) {
		System.out.println(" added pull msg");
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Biswajeet");
		map.put(2, "saurav");
		map.put(3, "Bhavik");
		map.put(4, "vivek");
		
		//Converting keys to list
		List<Integer> keyIntValuyes = map.keySet().stream().collect(Collectors.toList());
		System.out.println(keyIntValuyes);
		
		//converting values to list
		List<String> StringValues = map.values().stream().collect(Collectors.toList());
		System.out.println(StringValues);
		
		//adding two list to a new list
		List list = new ArrayList<>();
		list.add(keyIntValuyes);
		list.add(StringValues);
		System.out.println(list);
	}
}
