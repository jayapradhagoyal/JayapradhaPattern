package com.crm.vtiger;

public class Pattern3 {
	public static void main(String[] args) {
		int space=2;
		int star=1;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j<=n;j++)
			{ 
				System.out.print("   ");
			}
			
			for(int j=1;j<i;j++)
			{
				System.out.print("*  ");
			}
				
			for(int j=1;j<=i;j++)
			{
				System.out.print("*  ");
				
			}
			System.out.println();
				
				
			
			}
	
			


		
	}
}
