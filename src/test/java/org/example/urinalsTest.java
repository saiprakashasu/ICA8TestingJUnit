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
        assertEquals(0, u.countUrinals());
        System.out.println("Sai Prakash Test one executed");
    }
}