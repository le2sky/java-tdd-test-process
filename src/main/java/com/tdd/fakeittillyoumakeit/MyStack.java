package com.tdd.fakeittillyoumakeit;

public class MyStack {

    private int value;

    public int pop() {
        return value;
    }

    public void push(int value) {
        this.value = value;
    }
}
