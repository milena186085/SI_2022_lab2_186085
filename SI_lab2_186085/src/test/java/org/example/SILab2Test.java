package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {
    @Test
    void everyBranchTest() {
        //node 1
        // listHasElementsExceptionTest
        SILab2 lab = new SILab2();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> lab.function(new ArrayList<>()));
        String expectedMessage = "List length should be greater than 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        // node 4
        // perfectSquareSizeExceptionTest
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("0");
        Throwable exception2 = assertThrows(IllegalArgumentException.class, () -> lab.function(list));
        String expectedMessage2 = "List length should be a perfect square";
        String actualMessage2 = exception2.getMessage();
        assertTrue(actualMessage2.contains(expectedMessage2));

        // node 19
        // addMinesToListTest
        List<String> mines = Arrays.asList("#", "#", "#", "#");
        assertEquals(SILab2.function(mines), mines);

        // node 8, 10, 14, 16
        // detectFreeSpaceTest
        List<String> mines2 = Arrays.asList("0", "#", "0", "0");
        List<String> expected = Arrays.asList("1", "#", "0", "1");
        assertEquals(SILab2.function(mines2), expected);

        // nodes 10, 11, 14, 16 true value
        // surroundedByMinesTest
        List<String>    mines9 = Arrays.asList("0", "#", "0", "#", "0", "#", "0", "#", "0");
        List<String> expected9 = Arrays.asList("2", "#", "2", "#", "4", "#", "2", "#", "2");
        assertEquals(SILab2.function(mines9), expected9);
    }

    @Test
    void everyStatementTest() {
        // surroundedByMinesTest
        List<String>    mines9 = Arrays.asList("0", "#", "0", "#", "0", "#", "0", "#", "0");
        List<String> expected9 = Arrays.asList("2", "#", "2", "#", "4", "#", "2", "#", "2");
        assertEquals(SILab2.function(mines9), expected9);

        //node 1
        // listHasElementsExceptionTest
        SILab2 lab = new SILab2();

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> lab.function(new ArrayList<>()));
        String expectedMessage = "List length should be greater than 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        // node 4
        // perfectSquareSizeExceptionTest
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("0");

        Throwable exception2 = assertThrows(IllegalArgumentException.class, () -> lab.function(list));

        String expectedMessage2 = "List length should be a perfect square";
        String actualMessage2 = exception2.getMessage();
        assertTrue(actualMessage2.contains(expectedMessage2));
    }
}