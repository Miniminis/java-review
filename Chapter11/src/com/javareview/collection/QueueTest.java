package com.javareview.collection;

import java.util.ArrayList;

public class QueueTest {

    public static void run() {

        Queue queue = new Queue();
        queue.enQueue("Tiger");
        queue.enQueue("Rabbit");
        queue.enQueue("Goat");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}

class Queue {

    private ArrayList<String> arrQueue = new ArrayList<>();

    public void enQueue(String str) {
        arrQueue.add(str);
    }

    public String deQueue() {
        int queueSize = arrQueue.size();
        if(queueSize == 0) {
            return "Queue is empty!";
        }
        return arrQueue.remove(0);
    }
}
