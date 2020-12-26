package com.javareview.map.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        this.treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        this.treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        else
            System.out.println(memberId+"번 회원이 존재하지 않습니다!");
            return false;
    }

    public void showAllMembers() {
        Iterator<Integer> itr = treeMap.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
