
public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().arePalindromePermutation("NOON", "OONNA"));
	}

	public boolean arePalindromePermutation(String palindrome, String palindromePermutation) {
		palindrome=getStringWithSpaces(palindrome);
		palindromePermutation=getStringWithSpaces(palindromePermutation);
		int uniqueCharCount=0;
		char[] palindromeArray = palindrome.toCharArray();
		char[] palindromePermutationArray = palindromePermutation.toCharArray();
		boolean[] flags = new boolean[128];
		for (int i = 0; i < palindromeArray.length; i++) {
			if(!flags[(int) palindromeArray[i]]) {
			flags[(int) palindromeArray[i]] = true;
			uniqueCharCount++;
			}
		}
		if((uniqueCharCount%2)==0)
		{
			for (int i = 0; i < palindromePermutationArray.length; i++) {
				if(!flags[(int) palindromePermutationArray[i]])
					return false;
			}
			return true;
		}
		else
		{	int falseCount=0;
			for (int i = 0; i < palindromePermutationArray.length; i++) {
				if(!flags[(int) palindromePermutationArray[i]])
				{
					falseCount++;
					if(falseCount>1)
						return false;
				}
			}
			return true;
		}
		
		
	}
	
	
	
	
	public String getStringWithSpaces(String s)
	{
		while (s.contains(" ")) 
			s = s.replace(" ", "");
		return s;
	}

}
