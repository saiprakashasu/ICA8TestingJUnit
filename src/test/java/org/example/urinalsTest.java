package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;


class urinalsTest {

    @Test
    @DisplayName("count Urinals")
    void countUrinals() {
        urinals u = new urinals();
        assertEquals(0, u.countUrinals("1001"));
        System.out.println("Sai Prakash Test one executed");
    }
    @Test
    @DisplayName("valid String")
    void checkValidString() {
        urinals u = new urinals();
        assertEquals(-1, u.checkValidString("0011"));
        assertEquals(0, u.checkValidString("101010"));
        assertEquals(0,u.checkValidString("00000"));
        assertEquals(-1, u.checkValidString("101010010101010101010101010101010"));
        assertEquals(-1, u.checkValidString(""));
        System.out.println("Sai Prakash Test two executed");
    }

}