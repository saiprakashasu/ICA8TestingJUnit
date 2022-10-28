//Sai Prakash
package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;


class urinalsTest {

    @Test
    @DisplayName("count Urinals")
    void countUrinals1() {
        urinals u = new urinals();
        assertEquals(0, u.countUrinals("1001"));
        System.out.println("Sai Prakash Test one executed");
    }
    @Test
    @DisplayName("count Urinals")
    void countUrinals2() {
        urinals u = new urinals();
        assertEquals(1, u.countUrinals("10001"));
        System.out.println("Sai Prakash Test two executed");
    }
    @Test
    @DisplayName("count Urinals")
    void countUrinals3() {
        urinals u = new urinals();
        assertEquals(3, u.countUrinals("00000"));
        System.out.println("Sai Prakash Test three executed");
    }
    @Test
    @DisplayName("count Urinals")
    void countUrinals4() {
        urinals u = new urinals();
        assertEquals(-1, u.countUrinals("011"));
        System.out.println("Sai Prakash Test four executed");
    }
    @Test
    @DisplayName("count Urinals")
    void countUrinals5() {
        urinals u = new urinals();
        assertEquals(1, u.countUrinals("01000"));
        System.out.println("Sai Prakash Test five executed");
    }

    @Test
    @DisplayName("count Urinals")
    void countUrinals6() {
        urinals u = new urinals();
        assertEquals(2,u.countUrinals("0000"));
        System.out.println("Sai Prakash Test six executed");
    }
    @Test
    @DisplayName("valid String 1")
    void checkValidString1() {
        urinals u = new urinals();
        assertEquals(-1, u.checkValidString("0011"));
        System.out.println("Sai Prakash Test seven executed");
    }
    @Test
    @DisplayName("valid String 2")
    void checkValidString2() {
        urinals u = new urinals();
        assertEquals(0, u.checkValidString("101010"));
        System.out.println("Sai Prakash Test eight executed");
    }
    @Test
    @DisplayName("valid String 3")
    void checkValidString3() {
        urinals u = new urinals();
        assertEquals(0,u.checkValidString("00000"));
        System.out.println("Sai Prakash Test nine executed");
    }
    @Test
    @DisplayName("valid String 4")
    void checkValidString4() {
        urinals u = new urinals();
        assertEquals(-1, u.checkValidString("101010010101010101010101010101010"));
        System.out.println("Sai Prakash Test ten executed");
    }
    @Test
    @DisplayName("valid String 5")
    void checkValidString5() {
        urinals u = new urinals();
        assertEquals(-1, u.checkValidString(""));
        System.out.println("Sai Prakash Test eleven executed");
    }


}