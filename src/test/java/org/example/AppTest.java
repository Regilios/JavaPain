package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private Revers When_GivenWordsRevers_Expect_WordRevers = new Revers();

    @Test
    void revers() {
        assertEquals("",When_GivenWordsRevers_Expect_WordRevers.reversString(""));
        assertEquals(" ",When_GivenWordsRevers_Expect_WordRevers.reversString(" "));
        assertEquals(("1Xemo123s$ Ace*&!s"),When_GivenWordsRevers_Expect_WordRevers.reversString("1some123X$ sec*&!A"));
    }

}



