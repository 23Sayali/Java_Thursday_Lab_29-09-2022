//WAP to accept a number from user and then print the sum of the even and odd numbers.

import java.util.*;

public class Sum_Even_odd {

	public static void main(String[] args) {
		int num,evensum=0,oddsum=0;
		char ans;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the number");  //Taking input from user
			num=sc.nextInt();
			if(num%2==0)     //checking if number is even or odd 
			{
				evensum+=num;  //if even add the number in evensum integer
			}
			else {
				oddsum+=num;  //if odd add the number in oddsum integer
			}
			System.out.println("Do you want to add another number? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		//if ans is no or n then loop ends and all the updated values are displayed
		System.out.println("Addition of all Even Numbers is : "+evensum);
		System.out.println("Addition of all Odd Numbers is : "+oddsum);
	}
	

}