package Ass7;

public class DSA4 {

	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";

		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			char c=' ';
			StringBuilder sr = new StringBuilder();
			for (int j = s1[i].length()-1; j>=0; j--) {
					
				sr.append(s1[i].charAt(j));
			}
			s1[i]=sr.toString();
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+(i!=s1.length-1?" ":""));
		}
	}
}
