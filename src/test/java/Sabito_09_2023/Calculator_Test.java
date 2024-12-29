package Sabito_09_2023;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static Python.Calculator.*;
public class Calculator_Test {
    @Test
    void addition_Test(){
      assertEquals(4, addition(1,3));
    }
    @Test
    void subtraction_Test(){
        assertEquals(2, subtraction(3,1));
    }
    @Test
    void multiplication_Test(){
        assertEquals(4, multiplication(2,2));
    }
    @Test
    void division_Test(){
        assertEquals(4, division(200,50));
    }
    @Test
    void squaring_Test(){
        assertEquals(40000, squaring(200));
    }
    @Test
    void exponentiation_Test(){
        assertEquals(8000000, exponentiation(200,3));
    }
    @Test
    void  square_root_Test(){
        assertEquals(2, square_root(4));
    }
    @Test
    void  min_number_Test(){
        assertEquals(89, min_number(270,57876,89));
    }
    @Test
    void  max_number_Test(){
        assertEquals(6534, max_number(290,6534,78));
    }
}
