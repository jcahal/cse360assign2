package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	/*
	 * Tests that the AddingMachine is initially set to all 0s
	 */
	void initialTest() {
		AddingMachine initialState = new AddingMachine();
		
		assertEquals(0, initialState.getTotal());
		assertEquals("0 ", initialState.toString());
		
	}
	
	@Test
	/*
	 * Tests that the AddingMachine can add
	 */
	void addingTest() {
		AddingMachine plusFive = new AddingMachine();
		
		plusFive.add(5);
		
		assertEquals(5, plusFive.getTotal());
		assertEquals("0 + 5 ", plusFive.toString());
	}
	
	@Test
	/*
	 * Tests that the AddingMachine can subtract
	 */
	void subtractingTest() {
		AddingMachine minusFive = new AddingMachine();
		
		minusFive.subtract(5);
		
		assertEquals(-5, minusFive.getTotal());
		assertEquals("0 - 5 ", minusFive.toString());
	}
	
	
	@Test
	/*
	 * Tests that the AddingMachine can add and subtract
	 */
	void multiTest() {
		AddingMachine plusEightMinusFour = new AddingMachine();
		
		plusEightMinusFour.add(8);
		plusEightMinusFour.subtract(4);
		
		assertEquals(4, plusEightMinusFour.getTotal());
		assertEquals("0 + 8 - 4 ", plusEightMinusFour.toString());
	}
	
	@Test
	/*
	 * Tests that the AddingMachine can clear state
	 */
	void clearTest() {
		AddingMachine clearState = new AddingMachine();
		
		clearState.add(8);
		clearState.subtract(4);
		clearState.clear();
		
		assertEquals(0, clearState.getTotal());
		assertEquals("0", clearState.toString());
	}
}
