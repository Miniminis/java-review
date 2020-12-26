package com.javareview.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        this.hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        else
            System.out.println(memberId+"번 회원이 존재하지 않습니다!");
            return false;
    }

    public void showAllMembers() {
        Iterator<Integer> itr = hashMap.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
