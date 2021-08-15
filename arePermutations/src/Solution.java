
public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().arePermutations("Stuvi", "tSuvi"));
	}

	public boolean arePermutations(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s1.toCharArray();
		boolean[] flags = new boolean[128];
		for (int i = 0; i < c1.length; i++)
			flags[(int) c1[i]] = true;
		for (int i = 0; i < c2.length; i++) {
			if (!flags[(int) c1[i]])
				return false;
		}
		return true;
	}
}
