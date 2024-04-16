package oops_prog;

 class Testclass
{
	static String first_name="Mohammed";
	static String last_name="Junaith";
	static String Email_id="madina@143";
	static long mob_no=9087306221l;
	static String dob="18-02-2001";
	static String gender="Male";
	public static void show_account_details()
	{
		System.out.println("Account created sucessfully");
		System.out.println("Account holder first name: "+ first_name);
		System.out.println("Account holder last name: "+ last_name);
		System.out.println("Account holder Email id: "+ Email_id);
		System.out.println("Account holder mob_no: "+ mob_no);
		System.out.println("Account holder dob: "+ dob);
		System.out.println("Account holder gender: "+ gender);
	}
}
	public class Account_crea
	{
	public static void main(String[] args)
	{
		int a=10;
		
		Testclass.show_account_details();

	}
	
}
