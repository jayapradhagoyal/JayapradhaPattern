package com.crm.vtiger;

public class Pattern10 {
	public static void main(String[] args) {
		
		int n=4;
		int space=7;
		int star=1;
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("* ");
			}
			star=star+2;
			space--;
			
			System.out.println();
		}
	 n=4;
		 space=0;
		 star=7;
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print(" * ");
			}
			star= star-2;
			space=space+2;
			
			System.out.println();
		}
		
		
	

}
}

