package com.javareview;

public class Main {

    public static void main(String[] args) {
//        runCustomerExample();
        runAnimalTest();
    }

    private static void runAnimalTest() {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

        moveAnimal(human);
        moveAnimal(tiger);
        moveAnimal(eagle);

        if(tiger instanceof Human) {
            Human human1 = (Human) tiger;
            human1.readBook();
        } //실행안됨
    }

    private static void moveAnimal(Animal animal){
        animal.move();
    }

    private static void runCustomerExample() {
        Customer customer1 = new Customer("홍길동", 'S');
        customer1.buy(10000);
        customer1.showCustomerInto();

//        customer1.buy(5000);
//        customer1.showCustomerInto();

        VIPCustomer vipCustomer1 = new VIPCustomer("김사장", 'V', "손상담");
        vipCustomer1.buy(10000);
        vipCustomer1.showCustomerInto();

        Customer customer2 = new VIPCustomer("손사장", 'V', "이상담");
        customer2.buy(10000);
        customer2.showCustomerInto();

        /*
* ============홍길동님의 정보============
1
S
100.0
0.01
===================================
============김사장님의 정보============
1
V
450.0
0.05
===================================
*============손사장님의 정보============//자바에서는 항상 가상매서드가 호출됨
1
V
450.0
0.05
===================================
        * */
    }
}
