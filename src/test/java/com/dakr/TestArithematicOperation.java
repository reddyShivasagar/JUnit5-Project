package com.dakr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArithematicOperation {
	
	ArithematicOperation operation=null;
	
	
	@BeforeEach
	public void init() {
		operation=new ArithematicOperation();
	}
	
	public void destroy() {
		operation=null;
	}
	
	@Test
	public void test_add() {
		assertEquals(20,operation.add(15,5));
	}
	
	@Test
	public void test_multiply() {
		assertEquals(25, operation.multiply(5, 5));
	}
	
	@Test
	public void test_divide() {
		assertEquals(5,operation.divide(25, 5));
	}
	
	@Test
	public void test_Substract() {
		assertEquals(10,operation.substract(30, 20));
	}

}
