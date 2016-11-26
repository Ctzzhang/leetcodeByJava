

import java.util.Stack;

/*["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6*/

public class evaluate_reverse_polish_notation_002 {
	public class Solution {
		public int evalRPN(String[] tokens) {
			int num = 0;
			Stack<Integer> s = new Stack<Integer>();
			int len = tokens.length;
			for (int i = 0; i < len; i++) {
				if (tokens[i].equals("+")) {
					int first = s.pop();
					int second = s.pop();
					int sum = first + second;
					s.add(sum);

				} else if (tokens[i].equals("-")) {
					int first = s.pop();
					int second = s.pop();
					int sum = second - first;
					s.add(sum);

				} else if (tokens[i].equals("*")) {
					int first = s.pop();
					int second = s.pop();
					int sum = first * second;
					s.add(sum);

				} else if (tokens[i].equals("/")) {
					int first = s.pop();
					int second = s.pop();
					if (second == 0) {
						s.add(second);
					} else {
						int m = (int) second / first;
						s.add(m);

					}

				} else {
					s.add(Integer.parseInt(tokens[i]));
				}
			}
			num = s.peek();
			return num;
		}
	}

}
