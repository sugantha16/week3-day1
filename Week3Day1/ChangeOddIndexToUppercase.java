package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="changeme";
char[] ch=test.toCharArray();
for(int i=0; i<ch.length; i=i+2)
{
	ch[i]=Character.toUpperCase(ch[i]);
	}
System.out.println(ch);
	}

}
