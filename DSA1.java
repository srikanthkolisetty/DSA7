package Ass7;

import java.util.HashMap;
import java.util.Map;

public class DSA1 {

	public static void main(String[] args) {
		
		String str1 = "abca";
		String str2 = "zbxz";
		System.out.println("Is "+str1 +" and "+str2 +" are Isomorphic? "+is_Isomorphic(str1, str2));
	}
	
	
	public static boolean is_Isomorphic(String str1,String str2)
	{
		if(str1==null || str2==null || str1.length() !=str2.length())
			return false;
		
		Map<Character,Character> m= new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i),c2=str2.charAt(i);
			if(m.containsKey(c))
			{
				if(m.get(c)!=c2)
					return false;
			}
			else
			{
				if(m.containsValue(c2))
					return false;
				m.put(c,c2);
			}
		}
		return true;
	}
}
