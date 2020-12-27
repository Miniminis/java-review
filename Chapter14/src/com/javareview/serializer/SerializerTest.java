package com.javareview.serializer;

import java.io.*;

//class Person implements Serializable {        //구현 매서드 존재 X mark interface
class Person implements Externalizable {        //구현 매서드 존재
    String name;
    transient String job;       //transient : 직렬화 금지한다.

    Person (String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    // 직접 읽고 쓰는 것을 구현할 수 있다.
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}

public class SerializerTest {
    public static void run() {
        Person personLee = new Person("이순신", "엔지니어");
        Person personKim = new Person("김유신", "디자이너");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);       //serializable error 발생함
            oos.writeObject(personKim);

        } catch (Exception e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
