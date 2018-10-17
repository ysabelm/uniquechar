package com.uniquechar;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class uniquecharTest {

    @Test
    public void test() {
        String str = "abcdef";
        boolean output = uniquechar.uniqueChar(str);
        assertEquals(true, output);
    }
}