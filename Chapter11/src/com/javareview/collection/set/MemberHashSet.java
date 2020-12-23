package com.javareview.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> itr = hashSet.iterator();
        while(itr.hasNext()) {
            Member member = itr.next();
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+"번 회원이 존재하지 않습니다!");
        return false;
     }

     public void showAllMembers() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
     }
}
