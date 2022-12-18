package ec.edu.itsqmet.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	//@Test
	//void contextLoads() {
	//}
	//@Test
	//public int addNum (int num1, int num2) {
		//return num1 + num2 ;
	//}
	
	//void testSum() {
		//assertEquals(5, addNum(3,2));
	//}
	
	//- "FizzBuzz" if i is divisible by 3 and 5.
	//- "Fizz" if i is divisible by 3.
	//- "Buzz" if i is divisible by 5.
	//- If none of the above conditions are true, then return the given number
	
	@Test
	void testFizzBuzz() {
	    assertEquals("1", fizzBuzz(1));
	}

	private String fizzBuzz(int input) {
	    if (input % 3 == 0 && input % 5 == 0) {
	        return "FizzBuzz";
	    }
	    if (input % 3 == 0) {
	        return "Fizz";
	    }
	    if (input % 5 == 0) {
	        return "Buzz";
	    }
	    return String.valueOf(input);
	}



}
