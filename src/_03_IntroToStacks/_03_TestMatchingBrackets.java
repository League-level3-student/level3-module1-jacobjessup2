package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		int brackValue = 0;	
		Stack<String> test = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			test.push(b.charAt(i)+"");
		}
		for (int i = 0; i < b.length(); i++) {
			String yeet = test.pop();
			System.out.println(yeet);
			if(yeet.equals("}")) {
				brackValue++;
				System.out.println(brackValue);
			}
			if(yeet.equals("{")) {
				brackValue--;
				System.out.println(brackValue);
				if(brackValue <= -1) {
					return false;
				}
			}
			
		}
		if(brackValue == 0) {
			return true;
		}
		else {
		return false;
		}
	}

}