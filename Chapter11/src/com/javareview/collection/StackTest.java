package com.javareview.collection;

import java.util.ArrayList;

public class StackTest {
    public static void run() {
        MyStack myStack = new MyStack();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

class MyStack {
    private ArrayList<String> arrStack = new ArrayList<>();

    public void push(String data) {
        arrStack.add(data);
    }

    public String pop() {
        int stackLen = arrStack.size();
        if(stackLen == 0) {
            System.out.println("Stack is empty!");
            return null;
        }
        return arrStack.remove(stackLen-1);
    }
}