package com.tdd.fakeittillyoumakeit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MyStackTest {

    @Test
    void pop_should_return_pushed_value() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
    }
}
