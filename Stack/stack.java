package Stack;

public class stack {

	private char[] array;
	private int top;
	private int maxsize;

	public stack(int maxsize) {

		this.array = new char[maxsize];
		this.top = -1;
		this.maxsize = maxsize;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (top == maxsize - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(char x) {
		if (top == maxsize - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			array[top] = x;
		}

	}

	public char pop() {
		if (top == -1) {
			return 'F';
		} else {
			char y = array[top];
			top--;
			return y;
		}

	}

	public char peek() {
		if (top == -1) {
			return 'F';
		} else {
			return array[top];
		}
	}

}
