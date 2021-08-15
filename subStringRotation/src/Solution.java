
public class Solution {

	public static void main(String[] args) {
		String s1="vanSta";
		String s2="Stavan";
		
		System.out.println(new Solution().subStringRotation(s1+s1,s2));
	}

	public boolean subStringRotation(String s1, String s2) {
		return s1.contains(s2);
	}

	}
