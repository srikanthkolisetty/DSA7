package Ass7;

public class DSA2 {

	public static void main(String[] args) {
		
		String s="69";
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='8'||s.charAt(i)=='6'|| s.charAt(i)=='9')
			{
				continue;
			}
			else
			{
				flag=1;
				break;
			}
		}
		System.out.println("strobogramatic number:"+ (flag==1?false:true));
	}
}
