package com.javareview.collection.treeset;

import java.util.Comparator;

public class TreeSetTest2 {

    public static void run() {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        memberTreeSet.addMember(new Member(100, "홍길동"));
        memberTreeSet.addMember(new Member(200, "김길동"));
        memberTreeSet.addMember(new Member(300, "박길동"));

        memberTreeSet.showAllMembers();
    }

    /*
    * 저장 시에 객체를 비교하여 저장할 위치를 정한다.
    * Exception in thread "main" java.lang.ClassCastException: com.javareview.collection.treeset.Member cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1294)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at com.javareview.collection.treeset.MemberTreeSet.addMember(MemberTreeSet.java:15)
	at com.javareview.collection.treeset.TreeSetTest2.run(TreeSetTest2.java:7)
	at com.javareview.Main.main(Main.java:16)
    * */

    /*Member{memberId=100, memberName='홍길동'}
    Member{memberId=200, memberName='홍길동'}
    Member{memberId=300, memberName='홍길동'}
    */
}
