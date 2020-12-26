package com.javareview.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> itr = treeSet.iterator();
        while(itr.hasNext()) {
            Member member = itr.next();
            if (member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+"번 회원이 존재하지 않습니다!");
        return false;
     }

     public void showAllMembers() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
     }


}
