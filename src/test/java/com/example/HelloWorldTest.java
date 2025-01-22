// File: src/test/java/com/example/HelloWorldTest.java

package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testGreet() {
        String result = HelloWorld.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
}
