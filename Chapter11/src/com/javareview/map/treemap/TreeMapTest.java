package com.javareview.map.treemap;

public class TreeMapTest {

    public static void run() {
        MemberTreeMap manager = new MemberTreeMap();
        manager.addMember(new Member(300, "oh"));
        manager.addMember(new Member(100, "kim"));
        manager.addMember(new Member(300, "son"));
        manager.addMember(new Member(200, "park"));
        manager.addMember(new Member(300, "you"));      //맨 마지막에 덮어씌운 값이 최종으로 들어간다!

        manager.showAllMembers();

//        manager.removeMember(500);
        manager.removeMember(100);
        manager.showAllMembers();
    }

/* 정렬되어 값이 add 된다! - 이유는 Key 값인 Integer 클래스가 이미 Comparable 을 구현했기 때문!
- implements Comparable<Integer>

Member{memberId=100, memberName='kim'}
Member{memberId=200, memberName='park'}
Member{memberId=300, memberName='you'}*/
}
