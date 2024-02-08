package com.tdd.gettingstuck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordWrapTest {

    WordWrap wordWrap;

    @BeforeEach
    void setUp() {
        wordWrap = new WordWrap();
    }

    @Test
    void wrap() {
        // 삼각법을 적용한다.
        assertWrap(null, 1, "");
        assertWrap("", 1, "");
        assertWrap("x", 1, "x");
        assertWrap("xx", 1, "x\nx");
        assertWrap("xxx", 1, "x\nx\nx");
        assertWrap("x x", 1, "x\nx");
        assertWrap("x xx", 3, "x\nxx");
        assertWrap(
            "four score and seven years ago our fathers brought forth upon this continent",
            7,
            "four\nscore\nand\nseven\nyears\nago our\nfathers\nbrought\nforth\nupon\nthis\ncontine\nnt"
        );
    }

    private void assertWrap(String s, int width, String expected) {
        assertThat(wordWrap.wrap(s, width)).isEqualTo(expected);
    }
}
