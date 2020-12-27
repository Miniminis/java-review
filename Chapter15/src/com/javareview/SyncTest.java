package com.javareview;

public class SyncTest {

    public static Bank nonHyup = new Bank();

    public static void main() throws InterruptedException {

        Park park = new Park();
        park.start();

        Thread.sleep(200);

        ParkWife parkWife = new ParkWife();
        parkWife.start();
    }
}

class Bank {
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int money) {
        synchronized (this) { //Bank
            int balance = getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(balance + money);
        }
    }

    public synchronized void withdrawMoney(int money) {
        int balance = getMoney();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(balance - money);
    }
}

class Park extends  Thread {
    @Override
    public void run() {
        synchronized (SyncTest.nonHyup) {
            System.out.println("Park put money START");
            SyncTest.nonHyup.saveMoney(3000);
            System.out.println("Park put money END"+  SyncTest.nonHyup.getMoney());
        }
    }
}

class ParkWife extends Thread {
    @Override
    public void run() {
        synchronized (SyncTest.nonHyup) {
            System.out.println("Park wife use money START");
            SyncTest.nonHyup.withdrawMoney(1000);
            System.out.println("Park wife use money END" + SyncTest.nonHyup.getMoney());
        }
    }
}