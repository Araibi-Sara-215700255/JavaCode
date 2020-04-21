package combinationlock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComboTester {

	@Test
	public void testComboLock() {
		int secret1 = 3;
		int secret2 = 19;
		int secret3 = 30;
		
		ComboLock lock = new ComboLock(secret1, secret2, secret3);
		assertEquals(3, secret1);
		assertEquals(19, secret2);
		assertEquals(30, secret3);	
	}
	
	@Test
	public void testResult() {
		int ticks = 20;
		ComboLock numbers = new ComboLock(0,0,0);
		numbers.turnLeft(ticks);
		numbers.turnRight(0);
		numbers.reset();
	}
	
	@Test
	public void testTurnleft() {
		int ticks = 20;
		ComboLock numbers = new ComboLock(0,0,0);
		numbers.turnLeft(ticks);
		numbers.turnRight(0);
		assertEquals(20, ticks);
	}
	
	@Test
	public void testTurnright() {
		int ticks = 30;
		ComboLock numbers = new ComboLock(0,0,0);
		numbers.turnLeft(ticks);
		numbers.turnRight(0);
		assertEquals(30, ticks);
	}
	
	@Test
	public void testOpen() {
		ComboLock numbers = new ComboLock(0,0,0);
		
	}

}
