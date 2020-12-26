package com.javareview.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Member {

    private int memberId;
    private String memberName;

    public Member() {}
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if(this.memberId == member.memberId) {
                return true;
            }
        }
        return false;
    }

    public static class HashSetTest {
        public static void run() {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("이순신");
            hashSet.add("강감찬");
            hashSet.add("세종대왕");
            hashSet.add("이순신");

            System.out.println(hashSet);        //[강감찬, 이순신, 세종대왕] - 중복 안됨, 순서 없음

            Iterator<String> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }
}
