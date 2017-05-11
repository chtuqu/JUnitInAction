package com.chtuqu.junit_in_action.ch2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertShowcase {

    @Test
    public void testAssertEquals() { // equals / not equals
        int expected = 5;
        assertEquals(expected, 5);
        assertNotEquals(expected, 7);
    }

    @Test
    public void testAssertSame() { // same / not same
        String name1 = "Jack";
        String name2 = name1;
        String name3 = "Mike";
        assertSame(name1, name2);
        assertNotSame(name1, name3);
    }

    @Test
    public void testAssertTrue() { // true / false
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void testAssertNull() { // null / not null
        String lastName = "Johnson";
        assertNull(null);
        assertNotNull(lastName);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] array = { 3, 5, 7 };
        assertArrayEquals(array, new int[] { 3, 5, 7});
    }
}
