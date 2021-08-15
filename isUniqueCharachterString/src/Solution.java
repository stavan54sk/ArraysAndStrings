
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().isUniqueCharachterString("STuvi"));
	}

	public boolean isUniqueCharachterString(String s)
	{
		char[] c=s.toCharArray();
		boolean[] flags=new boolean[128];
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)c[i]);
			if(flags[(int)c[i]]) {
				return false;
			}
			else
			{
				flags[(int)c[i]]=true;
			}
				
		}
		return true;
	}
}
