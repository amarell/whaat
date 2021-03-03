package ds.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxIntegerTest {
	
	static int[] numbers;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		numbers = MaxInteger.readNumbers("D:\\\\Burch University\\\\2. year\\\\Semester 2\\\\Data Structures\\\\WORKSPACE\\\\week1-intro\\\\src\\\\ds\\\\intro\\\\numbers.txt");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		numbers = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCorrectlyFindsMaxNumber() {
		int maxNumber = MaxInteger.findMax(numbers);
		
		assertEquals(984, maxNumber);
	}
	
	@Test
	void testDoesNotFindIncorrect() {
		int maxNumber = MaxInteger.findMax(numbers);
		
		assertNotEquals(342, maxNumber);
	}

}
