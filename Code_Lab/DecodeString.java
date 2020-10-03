/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class solution{
    public static String decodeString(String s) {
	StringBuilder sb = new StringBuilder(); // store the result
	Stack<StringBuilder> s1 = new Stack<>(); // strings
	Stack<Integer> s2 = new Stack<>(); // nested reps
	StringBuilder reps = new StringBuilder(); // track reps > 9

	for (int i = 0; i < s.length(); i++) {
		final char c = s.charAt(i);
		if (Character.isDigit(c)) { // number? append to reps
			reps.append(c);
		} else if (c == '[') {
			int tmp = Integer.valueOf(reps.toString());
			s1.push(new StringBuilder());
			s2.push(tmp);
			reps.setLength(0);
		} else {
			// if c is a closed bracket, pop the reps as well as the string, and 
			// repeat the string
			String tmp = c == ']'? s1.pop().toString().repeat(s2.pop()): String.valueOf(c);
			// empty stack? append to the result, otherwise append to the top of element
			// at the top of the stack
			if (s1.isEmpty()) {
				sb.append(tmp);
			} else {
				s1.peek().append(tmp);
			}
		}
	}
	return sb.toString();
}
}