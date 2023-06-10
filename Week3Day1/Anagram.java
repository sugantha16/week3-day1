package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stops";
String text2="potss";
int length1= text1.length();
int length2=text2.length();

if (length1==length2)
{
char[] ch=text1.toCharArray();
char[] ch1=text2.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);
boolean result=Arrays.equals(ch, ch1);

if(result)
System.out.println("ANAGRAM");
	}
else
{
	System.out.println("NOT ANAGRAM");
	}
	}

}
