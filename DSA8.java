package Ass7;

public class DSA8 {

	public static void main(String[] args) {
		
		int n[][]=new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7},{7,8}};
		
		int prev=n[0][1],flag=1;
		for(int i=0;i<n.length;i++)
		{
					if(i!=0 && prev!=n[i][0])
					{
						flag=0;
					}
					else
					{
						prev=n[i][1];
					}
		}
		System.out.println("foms straight line "+(flag==0?false:true));
	}
}
