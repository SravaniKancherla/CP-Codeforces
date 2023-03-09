package recursion;

/**
 * Different Ways to Add Parentheses
 * Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators.
 * You may return the answer in any order.
 * Input: expression = "2*3-4*5"
	Output: [-34,-14,-10,-10,10]
	Explanation:
		(2*(3-(4*5))) = -34 
		((2*3)-(4*5)) = -14 
		((2*(3-4))*5) = -10 
		(2*((3-4)*5)) = -10 
		(((2*3)-4)*5) = 10
 */
import java.util.LinkedList;
import java.util.List;

public class AddParanthesisLC {

	public static List<Integer> diffWaysToCompute(String expression) {

		List<Integer> result = new LinkedList<>();
		for (int i = 0; i < expression.length(); i++) {
			char curr = expression.charAt(i);
			if (curr == '+' || curr == '-' || curr == '*') {
				List<Integer> result1 = diffWaysToCompute(expression.substring(0, i));
				List<Integer> result2 = diffWaysToCompute(expression.substring(i + 1));

				for (Integer x : result1) {
					for (Integer y : result2) {
						if (curr == '+')
							result.add(x + y);
						else if (curr == '-')
							result.add(x - y);
						else
							result.add(x * y);

					}
				}
			}

		}
		// If the input string contains only one number
		if (result.isEmpty())
			result.add(Integer.parseInt(expression));
		return result;
	}

	public static void main(String args[]) {
		System.out.println(diffWaysToCompute("3+5-6*2"));
		System.out.println(diffWaysToCompute("2*3-4*5"));
	}

}
