package com.example.Calculatrice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
	
	@Test
	public  void testAdd(){
	    //Given
	    Calculatrice calculatrice = new Calculatrice();
	    int a = 5;
	    int b = 10;
	    int expectedResult = 15;
	    int result;
	
	    //When
	    result = calculatrice.add(a, b);
	
	    //Then
	    Assertions.assertNotNull(result);
	    Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public  void testSoustraction(){
	    //Given
	    Calculatrice calculatrice = new Calculatrice();
	    int a = 5;
	    int b = 10;
	    int expectedResult = 5;
	    int result;
	
	    //When
	    result = calculatrice.diff(a, b);
	
	    //Then
	    Assertions.assertNotNull(result);
	    Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public  void testMultiplication(){
	    //Given
	    Calculatrice calculatrice = new Calculatrice();
	    int a = 5;
	    int b = 10;
	    int expectedResult = 50;
	    int result;
	
	    //When
	    result = calculatrice.mult(a, b);
	
	    //Then
	    Assertions.assertNotNull(result);
	    Assertions.assertEquals(expectedResult, result);
	}
	
	
}






