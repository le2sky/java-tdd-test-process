package com.tdd.assertfirst;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MailBoxTest {

    @Test
    void newMailBox_should_empty() {
        MailBox mailBox = new MailBox();
        assertThat(mailBox.messageCount()).isEqualTo(0);
    }
}
