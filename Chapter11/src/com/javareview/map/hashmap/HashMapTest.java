package com.javareview.map.hashmap;

public class HashMapTest {

    public static void run() {
        MemberHashMap manager = new MemberHashMap();
        manager.addMember(new Member(100, "kim"));
        manager.addMember(new Member(200, "park"));
        manager.addMember(new Member(300, "oh"));
        manager.addMember(new Member(300, "son"));
        //중복 안됨 - Integer 내부에서 equals, hashCode() 재정의 되어있기 때문!

        manager.showAllMembers();

//        manager.removeMember(500);
        manager.removeMember(100);
        manager.showAllMembers();
    }
}
