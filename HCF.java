//Write a program to calculate HCF of Two given number.

import java.util.*;

public class HCF {

	public static void main(String[] args) {
		int n1, n2, hcf=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");     //Taking input from user for 1st number
		n1=sc.nextInt();
		
		System.out.println("Enter the Second Number"); //Taking input from user for 2nd number
		n2=sc.nextInt();
		
	    for (int i=1;i<=n1||i<=n2;i++)   //using for loop to HCF [Highest Common Factor] we initialize i in this loop
	      {
	    
	     if (n1%i==0&&n2%i==0)   	//checking if both numbers are completely divided by i with if conditional statement
	        hcf=i;
	      }
	    
	    System.out.println("The HCF of Two Given Numbers is : "+hcf); //Display the HCF
	}

}