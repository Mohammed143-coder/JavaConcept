package oops_prog;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class CustomException {
	public static void check(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("oops!!! sorry come nxt year...");}
		else {
			System.out.println("Great this time u get 1000 for your vote");
			//System.out.println("Th");
		}
		}

	public static void main(String[] args) {
		System.out.println("Enter ur age..");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		try {
			check(age);
		}
		catch(InvalidAgeException ie) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured:"+ie);
		}
	}

}
