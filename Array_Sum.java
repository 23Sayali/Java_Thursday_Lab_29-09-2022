//WAP to accept number from user in array and find out the average and sum of array numbers


import java.util.*;

public class Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i,sum = 0,avg;
		System.out.println("Enter size : ");  //taking input from user
		size=sc.nextInt();
		int no[]=new int[size];
		System.out.println("Enter "+size+" numbers:");
		
		for(i=0;i<size;i++)  //using for loop to find the sum of total numbers in array 
		{
			no[i]=sc.nextInt();
		}
		for(i = 0; i < no.length; i++) {
			sum += no[i];
		}
		avg=sum/size;

		System.out.println("Sum of all elements in array is : "+sum);  //Displaying the output
		System.out.println("Average of all elements in array is : "+avg);
	}

}