package com.javareview.objects;

public class EqualTest {
    public static void run() {
        String str1 = new String("zoody");
        String str2 = str1;
        String str3 = new String("zoody");

        System.out.println(str2.equals(str1));      //true
        System.out.println(str3.equals(str1));      //true

        System.out.println("===================");      //true

        Student student1 = new Student(1001, "김반장");
        Student student2 = student1;
        Student student3 = new Student(1001, "김반장");

        System.out.println(student2.equals(student1));      //true
        System.out.println(student3.equals(student1));      //false - 물리적으로는 다르지만, 논리적으로는 같기 때문에

        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());

        System.out.println("===================");
        /*실제 메모리값 조회하기 */
        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student3));
    }
}

class Student {
    int studentNum;
    String studentName;

    Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (this.studentNum == student.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
