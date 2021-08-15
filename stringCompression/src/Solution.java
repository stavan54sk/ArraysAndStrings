import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().stringCompression("abc"));
	}

	public String stringCompression(String s1) {
		Map<Character,Integer> uniquechars=new HashMap<>();
		StringBuilder sb=new StringBuilder("");
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if(uniquechars.containsKey(c1[i])) {
			int count=uniquechars.get(c1[i]);
			uniquechars.put(c1[i], ++count);
			}
			else
			{
			uniquechars.put(c1[i], 1);
			}
		}
		
		 for (Map.Entry<Character,Integer> entry : uniquechars.entrySet()) {
	           sb.append(entry.getKey());
	           sb.append(entry.getValue());             
	    }
		 return sb.toString().length()>s1.length()?s1:sb.toString();
	}
}
