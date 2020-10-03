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
     public boolean backspaceCompare(String S, String T) {
        
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		// S String
		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '#') {
				if (sb1.length() == 0)
					continue;
				else
					sb1.delete(sb1.length() - 1, sb1.length());
			} else
				sb1.append(S.charAt(i));

		}
		// T String
		for (int i = 0; i < T.length(); i++) {

			if (T.charAt(i) == '#') {
				if (sb2.length() == 0)
					continue;
				else
					sb2.delete(sb2.length() - 1, sb2.length());
			} else
				sb2.append(T.charAt(i));

		}

		return (sb1.toString()).equals(sb2.toString());
    }
}