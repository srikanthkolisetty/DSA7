package Ass7;

public class DSA5 {

	public static void main(String[] args) {
		
		String s="abcdefg";
		int k=2;
		for (int i = 0; i < s.length();)
	    {
	 
	        // If there are less than k characters
	        // starting from the current position
	        if (i + k > s.length())
	            break;
	 
	        // Reverse first k characters
	        s = s.substring(0, i) + new String(new StringBuilder(
	            s.substring(i, i + k)).reverse()) +
	            s.substring(i + k);
	 
	        // Skip the next k characters
	        i += 2 * k;
	    }
		System.out.println(s);
	}
}
