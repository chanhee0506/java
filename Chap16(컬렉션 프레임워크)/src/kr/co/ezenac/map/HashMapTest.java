package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : "+ map.size());
		
		map.put("이순신", 95);
		map.put("정도전", 90);
		map.put("신사임당", 80);
		map.put("정도전", 95);
		map.put("이성계", 95);
		
		System.out.println("사이즈 : "+ map.size());
		System.out.println("값 : " + map.get("정도전"));
		System.out.println();
		
		Set<Map.Entry<String, Integer>>  entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator 
					= entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();			//키값 얻음
			int value = entry.getValue();			//값을 얻음
			System.out.println(key +" : "+ value);
		}
		
		//전체 객체 삭제
		map.clear();		
		System.out.println("사이즈 : "+ map.size());
		
	}
}























