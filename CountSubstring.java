import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int countSubstrings(String s) 
	{
		int size = s.length();
		int dp[] = new int[size];
		if(s.charAt(0)=='a'||
			s.charAt(0)=='e'||
			s.charAt(0)=='i'||
			s.charAt(0)=='o'||
			s.charAt(0)=='u'){
				dp[0] = 1;
			}
		for(int i = 1;i<size;i++){
			if(s.charAt(i)=='a'||
			s.charAt(i)=='e'||
			s.charAt(i)=='i'||
			s.charAt(i)=='o'||
			s.charAt(i)=='u'){
				dp[i] = 1+dp[i-1];
			}
		}
		for(int i=0;i<size-1;i++){
			dp[i+1] += dp[i];
		}
		return dp[size-1];
	}
}
