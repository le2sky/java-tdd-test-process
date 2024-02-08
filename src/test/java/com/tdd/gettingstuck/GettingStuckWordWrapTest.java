package com.tdd.gettingstuck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GettingStuckWordWrapTest {

    @Test
    void wrap() {
        assertThat(wrap("word word", 4)).isEqualTo("word\nword");
        assertThat(wrap("a dog", 5)).isEqualTo("a dog");
        // getting stuck! -> 다시 만들어야 해
        assertThat(wrap("a dog with a bone", 6)).isEqualTo("a dog\nwith a\nbone");
    }

    private String wrap(String s, int width) {
        return s.length() <= width ? s : s.replaceAll(" ", "\n");
    }
}
