/*
 WAP to accept the number from user and check if it is prime or not, Pass the number in different function and check 
 if it is Even or Odd, If Even check if number is divisible by 10 or not, If Odd Check if number
is divisible by 3 or not.
*/

import java.util.*;

public class Prime_Function {

	public static void main(String[] args) {
		Prime_Function obj=new Prime_Function();  		//Generating object
		Scanner sc = new Scanner(System.in);
		int num;
		
	    System.out.print("Enter the Number : ");  //taking input from user as number
	    num = sc.nextInt();
	   
		char a=obj.evenodd(num);   //calling evenodd() to get if number is even or odd
		obj.prime(num);

		if(a=='e') {  //using if else condition to run even or odd part
			obj.ifeven(num);
		}
		else {
			obj.ifodd(num);
		}
	}
	public void prime(int p) {
		int i, count=0;
		
	    for(i=2; i<p; i++) 
	    {
	   
	       if(p%i == 0)
	       {
	          count++;
	          break;
	       }
	    }
	      
	      if(count==0)   //if else to print if prime or not 
	      {
	      System.out.println(+p+" is a Prime Number.");
	   }
	      else {
	      System.out.println(+p+" is not a Prime Number.");
	   }
	}
	public char evenodd(int EO) {
		char ans; //initializing character to take value if number is even or odd
		if(EO%2==0) {
			System.out.println(+EO+" is Even");
			ans='e';
		}
		else {
			System.out.println(+EO+" is Odd");
			ans='o';
		}
	
		return ans; 	//returning the ans in function
	}
	public void ifeven(int e) { 
		
		if(e%10==0)  //checking if the number is divisible by 10 or not 
		{
			System.out.println(+e+" is divisible by 10");
		}
		else {
			System.out.println(+e+" is not divisible by 10");
		}
	}
	public void ifodd(int o) {
		if(o%3==0) //checking if the number is divisible by 3 or not 
		{
			System.out.println(+o+" is divisible by 3");
		}
		else {
			System.out.println(+o+" is not divisible by 3");
		}
	}

}