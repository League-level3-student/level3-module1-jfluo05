package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
	
	int obc= 0;
	//obc=open bracket counter
	int cbc=0;
	//cbc=open bracket counter

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
		Stack<Character> cb= new Stack<Character>();
		//cb=curly brackets
		for (int i = 0; i < b.length(); i++) {
			Character c= b.charAt(i);
			cb.push(c);
		}
		
		
		
		while(!cb.isEmpty()) {
			char ch=cb.pop();
		if (ch=='{') {
			obc= obc+1;
		}else if(ch=='}'){
			cbc= cbc+1;
		}
				}
		
		if(cbc==obc) {
			return true;
	}
		return false;
}}