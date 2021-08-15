
public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().oneEditAway("STAVA", "STAVAN"));
	}

	public boolean oneEditAway(String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) == 1) {
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			boolean[] flags = new boolean[128];
			for (int i = 0; i < s1Array.length; i++) {
				flags[(int) s1Array[i]] = true;
			}
			int falseCount = 0;
			for (int i = 0; i < s2Array.length; i++) {
				if (!flags[(int) s2Array[i]]) {
					falseCount++;
					if (falseCount > 1)
						return false;
				}
			}
			return true;
		} 
		else if(Math.abs(s1.length() - s2.length()) > 2)
			return false;
		else {
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			boolean[] flags = new boolean[128];
			for (int i = 0; i < s1Array.length; i++) {
				flags[(int) s1Array[i]] = true;
			}
			for (int i = 0; i < s2Array.length; i++) {
				if (!flags[(int) s2Array[i]])
					return false;
			}
			return true;
		}
	}
}
