package Ass7;

public class DSA7 {

	public static void main(String[] args) {
		
		String a="ad#c",b="ab#c";
		char[] c1=a.toCharArray(),c2=b.toCharArray();
		if(a.length()!=b.length())
		{
			System.out.println(false);
		}
		else
		{
			String s1="",s2="";
			for(int i=0;i<c1.length;i++)
			{

				if(i<c1.length-1 && c1[i+1]!='#' && c1[i]!='#')
				{
					s1+=c1[i];
				}
				if(i<c2.length-1 && c2[i+1]!='#' && c2[i]!='#')
				{
					s2+=c2[i];
				}
				if(i==c1.length-1 && c1[i]!='#')
					s1+=c1[i];
				if(i==c2.length-1 && c2[i]!='#')
					s2+=c2[i];
			}
			System.out.println(s1+" "+ s2);
			System.out.println("both are equal "+s1.equals(s2));
			
		}
		
		
	}
}
