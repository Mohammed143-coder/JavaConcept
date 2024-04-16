package test.assignments;
import java.util.Scanner;
public class Main_emp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter details to check .....");
	System.out.println("Enter your years of experience");
	int years=sc.nextInt();
	System.out.println("Enter your salary");
	double salary=sc.nextDouble();
	Empl e1=new Empl();
	e1.setSal(salary);
	Checkemp.chexp(years, e1);
	sc.close();
	}
}
