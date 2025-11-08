package task2;
import java.util.*;
public class StudentGradeCalculator {
	static boolean isNumber(String str) 
	{
		int len=str.length();
        for (int i=0;i<len;i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Total number of subjects: ");
		int sub=read.nextInt();
		System.out.print("Name of the user: ");
		String name=read.next();
		String str[]=new String[sub];
		float marks[]=new float[sub];
		float sum=0;
		try
		{
			for(int i=0;i<sub;i++)
			{
				System.out.print("Enter Subject "+(i+1)+" Name: ");
				str[i]=read.next();
				System.out.print("Enter Marks Secured in "+str[i]+" Subject: ");
				marks[i]=read.nextFloat();
				if(marks[i]>100 || isNumber(str[i]))
				{
					System.out.println("Invalid Entry, Please Try again");
					return;
				}
				sum+=marks[i];
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Entry, try again");
			return;
		}
		System.out.println("Marks Report of Student: "+name);
		for(int i=0;i<sub;i++)
		{
			System.out.print("Subject: "+str[i]+" \tMarks: "+marks[i]);
			System.out.println();
		}
		double avg=sum/sub;
		System.out.println("Total Marks: "+sum);
		System.out.println("Average of all Subjects= "+avg);
		if(avg>=90.0)
			System.out.println("S Grade");
		else if(avg>=80.0 && avg<90.0)
			System.out.println("A Grade");
		else if(avg>=70.0 && avg<60.0)
			System.out.println("B Grade");
		else if(avg>=60.0 && avg<50.0)
			System.out.println("C Grade");
		else
			System.out.println("F Grade(Fail)");
	}
}
