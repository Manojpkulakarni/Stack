package org.egov.basecamp;

public class Stack<T> {
	private int top;
	private int maxSize;
	private Object[] stackArray;

	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public Stack(int size) {
		this.maxSize = size;
		stackArray = new Object[maxSize];
		top = -1;
	}

	public void push(T element) {
		if (element == null)
			throw new NullPointerException();
		stackArray[++top] = element;
	}

	public T pop() {
		if (isEmpty())
			throw new NullPointerException();
		return (T) stackArray[top--];
	}

	public T[] toArray() {
		if (isEmpty())
			return (T[]) new Object[0];
		else
			return (T[]) stackArray;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean contains(T element) {
		if (element == null)
			throw new NullPointerException();
		for (int i = 0; i <= top; i++)
			if (stackArray[i] == element)
				return true;

		return false;
	}
}
