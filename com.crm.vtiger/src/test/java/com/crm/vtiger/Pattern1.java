package com.crm.vtiger;

public class Pattern1 {
	public static void main(String[] args) {
		int space=2;
		int star=1;
		int n=4;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(" * ");
			}
			else
			{
				System.out.print("  ");
			}
			}
	
		System.out.println();
		
	}
	}

	
}
