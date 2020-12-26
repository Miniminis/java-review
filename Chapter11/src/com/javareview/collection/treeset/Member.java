package com.javareview.collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {
        //Comparable<Member>

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

//    @Override
//    public int compareTo(Member member) {
//        return (this.memberId - member.getMemberId()) * (-1);
//    }

    @Override
    public int compare(Member member1, Member member2) {
        return member1.getMemberName().compareTo(member2.getMemberName());
    }

}
