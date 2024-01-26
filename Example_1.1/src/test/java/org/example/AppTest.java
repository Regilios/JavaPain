package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private Revers revers = new Revers();

    @Test
    void revers() {
        assertEquals("",revers.reversString(""));
        assertEquals(" ",revers.reversString(" "));
        assertEquals("   ",revers.reversString("   "));
        assertEquals("a   /",revers.reversString("a   /"));
        assertEquals("..,   /",revers.reversString(",..   /"));
        assertEquals("cba   /",revers.reversString("abc   /"));
        assertEquals("cba",revers.reversString("abc"));
        assertEquals("cba",revers.reversString("abc"));
        assertEquals("cba11cba",revers.reversString("abc11abc"));
        assertEquals("123cba",revers.reversString("123abc"));
        assertEquals("cba123",revers.reversString("abc123"));
        assertEquals("c1b1a",revers.reversString("a1b1c"));
        assertEquals("c1b1a 123cba cba11cba",revers.reversString("a1b1c 123abc abc11abc"));
        assertEquals("123 c1b1a 123cba   cba11cba",revers.reversString("123 a1b1c 123abc   abc11abc"));
    }

}



