package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
	
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
