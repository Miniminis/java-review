package com.javareview.collection.hashset;

public class HashSetTest2 {

    public static void run() {
        MemberHashSet manager = new MemberHashSet();
        manager.addMember(new Member(100, "kim"));
        manager.addMember(new Member(200, "son"));
        manager.addMember(new Member(300, "park"));
        manager.addMember(new Member(300, "park"));

        manager.showAllMembers();

        manager.removeMember(300);
        manager.showAllMembers();


    }
}
