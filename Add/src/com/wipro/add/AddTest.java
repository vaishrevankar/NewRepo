package com.wipro.add;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Add_Num test = new Add_Num();
		int result = test.add(5,6);
		assertEquals(11,result);
		
	}

}
