package com.example.lesson6android3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringMethod {
    protected StringMethod method;

    @Before
    public void newInstance() {
        method = new StringMethod();
    }

    @Test
    public void swapWords() {
        assertEquals("dlroW olleH", method.mirrorWords("Hello World"));
    }

    @Test
    public void mirrorWords() {
        assertEquals("World Hello", method.swapWords("Hello World"));
    }

    @After
    public void nulling() {
        method = null;
    }
}
