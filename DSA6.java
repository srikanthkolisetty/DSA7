package Ass7;

public class DSA6 {

	public static void main(String[] args) {
		
		String s="abcde",goal="cdeab";
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			s=s.substring(1)+s.substring(0, 1);
			if(s.equals(goal))
				flag=1;
		}
		System.out.println(flag==1?true:false);
	}
}
