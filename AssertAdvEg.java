package com.JUnitTestArithmetic;

import org.junit.jupiter.api.Test;

import com.JUnitTest.Arithemetic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // ordering the test cases
class AssertAdvEg {

    private  Arithemetic arithmetic ;

    @BeforeAll // execute only once that to before all test cases
    static void befallmet() {
    System.out.println("Before All method.......");
    }
    
    @BeforeEach
    void befeachmet() {
    arithmetic = new Arithemetic();
    System.out.println("Before Each method--------");
    }
    
    
    @Test
    @Order(0)
    @Tag("feature1")
    void testAdd() {
        assertEquals(5, arithmetic.add(2, 3), "Addition should return the sum of two numbers");
        System.out.println("Test-1.......");
    }
    
    @Test
    @Order(1)
    @Tag("feature3")
    void testAddNegNum() {
    	int result = arithmetic.add(-2, -3);
    	assertEquals(-5, result, "Addition possible for negative numbers" );
    	 System.out.println("Test-2.......");
    }
    
    @Test
    @Tag("feature1")
    void testArray() {
    	int []  arr = {123,34,546,34,6};
    	int [] actual_arr =	arithmetic.reverse(arr);
    	int [] expected_arr = {6,34,546,34,123};
    	assertArrayEquals(expected_arr, actual_arr, "Reverse of array while comparing" );
    	 System.out.println("Test-10.......");
    }

    @Test
    @Order(2)
    @Tag("feature3")
    void testSubtract() {
        assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
        System.out.println("Test-3.......");
    }

    @Test
    @Order(3)
    @Tag("feature1")
    void testMultiply() {
        assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
        System.out.println("Test-4.......");
    }
    
    

    @Test
    @Order(7)
    @Tag("feature2")
    void testDivide() {
        assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
        System.out.println("Test-5.......");
    }
    
    @Test
    @Order(6)
    @Tag("feature2")
    void testMax() {
        assertEquals(10.01, arithmetic.max(10.01, 10.001), "Max value of given two numbers");
        System.out.println("Test-6.......");
    }

   @Disabled //disabled this test case
    @Test
    void negtestMax() {
        assertEquals(-0.01, arithmetic.max(-0.01, -10.01), "Max value of given two numbers");
        System.out.println("Test-7.......");
    }
    
    @Test
    @Order(4)
    @Tag("feature5")
    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
        System.out.println("Test-8.......");
    }
    @AfterEach
    void aftereach() {
    System.out.println("after each.......");
    }
    
    @AfterAll
    static void afterall() { //@BeforeAll and @AfterAll required to be "static" so that it executes before object creation. (static using method invokes without object)
        System.out.println("after all.......");
        }
        
    
}
