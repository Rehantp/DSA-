package Stack;

import java.util.Stack;

public class checkBrackets {

	private String algorithm;

	public checkBrackets(String algorithm) {

		this.algorithm = algorithm;
	}

	public void validationMethod() {

		int count = algorithm.length();
		stack obj2 = new stack(count);

		for (int i = 0; i < count; i++) {
			if (algorithm.charAt(i) == '(') {
				obj2.push('X');
			}

			else if (algorithm.charAt(i) == ')') {
				obj2.pop();
			}
		}

		if (obj2.isEmpty() == true) {
			System.out.println("you are inserted a valid algorithm");
		} else if (obj2.isEmpty() == false) {
			System.out.println("you are inserted a Invalid algorithm");
		}

	}

}
