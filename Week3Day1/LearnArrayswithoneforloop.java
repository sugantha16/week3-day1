package week3.day1;

public class LearnArrayswithoneforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,3,4,5,6,7,7,9,9};
		{
			for(int i=0; i<num.length-1; i++)
			{
				if (num[i]==num[i+1])
				{
					System.out.println(num[i+1]);
				}
			}
		}

	}

}
