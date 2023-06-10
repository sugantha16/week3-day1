package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="MADAM";
		String rev = "";
		int length=value.length();
		for (int i=length-1; i>=0;i--)
		{
			rev = rev + value.charAt(i);
		}
		if(value.equals(rev))
		{
			System.out.println("Its is Palindrome");
		}
		else
			System.out.println("NOT a Palindrome");
		}

		
}
