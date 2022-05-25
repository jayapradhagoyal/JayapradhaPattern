package com.crm.vtiger;

public class Pattern4 {
	public static void main(String[] args) {
		int space=2;
		int star=1;
		int n=4;
		for(int i=1;i<n;i++)
		{
			
			for(int j=1;j<=space;j++)
			{ 
				System.out.print("   ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*  ");
			}
				space--;
				star=star+2;
		
			System.out.println();
				
				
			
			}
	}
}
	
	


