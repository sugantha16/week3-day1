package week3.day1;

public class Student {

	public void studentName()
	{
		System.out.println("Student Name is Priya");
	}
	public void studentDept()
	{
		System.out.println("Student Dept is Comp Sci");
	}
	public void studentId()
	{
		System.out.println("Student Id is 123");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	College a=new College();
 	a.collegeName();
 	a.collegeCode();
 	a.collegeRank();
 Department b=new Department();
 	b.deptName();
 Student c=new Student();
 	c.studentName();
 	c.studentDept();
 	c.studentId();
}

}
