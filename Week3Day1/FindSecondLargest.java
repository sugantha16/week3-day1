package week3.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {3,2,11,4,6,7};
		//2,3,4,6,7,11
		Arrays.sort(data);
System.out.println("The second largest number from 3,2,11,4,6,7 is " + data[1]);
		
	}

}
