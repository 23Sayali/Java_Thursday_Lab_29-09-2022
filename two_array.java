//WAP to display prime no between 1 to 150 in two dimension array

import java.util.*;

public class two_array{

	public static void main(String[] args) {
		
		int i,count,n=150;
        System.out.println("Prime numbers between 1 to 150 are ");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(i=1;i<=j;i++)
        	{
        		if(j%i==0)
        		{
        			count++;        
        		}
        	}
        	if(count==2)
        		System.out.print(j+"  ");     
        }
	}

}