
public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().convertToUrl("STavan       is      a           Good     Boy"));
		
	}

	public String convertToUrl(String s) {
		while(s.contains("  "))
		{
			s=s.replace("  ", " ");
		}
		return s.replace(" ", "%20");
	}
	
	
	
}
