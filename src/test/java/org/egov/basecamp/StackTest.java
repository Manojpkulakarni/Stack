package org.egov.basecamp;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldThrowNullPointerExceptionWhenNullInserted() throws Exception {
		Stack<Integer> stack = new Stack(10);
		thrown.expect(NullPointerException.class);
		stack.push(null);

	}

	@Test
	public void shouldThrowNullPointerExceptionWhenPopEmptyStack() throws Exception {
		Stack<Integer> stack = new Stack(10);
		thrown.expect(NullPointerException.class);
		stack.pop();
	}

	@Test
	public void shouldReturnZeroSizeFromEmptyStack() throws Exception {
		Stack<Integer> stack = new Stack(10);
		assertEquals(0, stack.size());
	}

	@Test
	public void shouldGiveEmptyArrayOnEmptyStack() throws Exception {
		Stack<Integer> stack = new Stack(10);
		assertArrayEquals(new Integer[] {}, stack.toArray());
	}

	@Test
	public void shouldThrowNullPointerExceptionWhenNullIsSearched() throws Exception {
		Stack<Integer> stack = new Stack(10);
		thrown.expect(NullPointerException.class);
		stack.contains(null);
	}

	@Test
	public void shouldBeAbleToPushOnEmptyStack() throws Exception {
		Stack<Integer> stack = new Stack(1);
		stack.push(1);
		assertEquals(1, stack.size());
		assertArrayEquals(new Integer[] { 1 }, stack.toArray());
	}

	@Test
	public void shouldBeAbleToPop() throws Exception {
		Stack<Integer> stack = new Stack(10);
		stack.push(1);
		stack.pop();
		assertEquals(0, stack.size());
		assertArrayEquals(new Integer[] {}, stack.toArray());
	}

	@Test
	public void shouldBeAbleToPushOnStack() throws Exception {
		Stack<Integer> stack = new Stack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertEquals(4, stack.size());
		assertArrayEquals(new Integer[] { 1, 2, 3, 4 }, stack.toArray());
	}

	@Test
	public void shouldBeAbleToSearchForExistingElement() throws Exception {
		Stack<Integer> stack = new Stack(1);
		stack.push(1);
		boolean contains = stack.contains(1);
		assertTrue(contains);
		boolean contains1 = stack.contains(2);
		assertFalse(contains1);
		assertArrayEquals(new Integer[] { 1 }, stack.toArray());
	}
}
