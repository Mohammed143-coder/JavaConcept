package flowcontrol_stmt;

public class Do_while {
	int count =1;
	public static void test(int num) {
		for (int i= 1; i<= num; i++) {
			for (int j=num;j>=i;j--) {
				System.out.print(" ");}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+k);
			}
			System.out.println(); 
		}
	}
	public static void main(String[] args) {
		test(4);
	}
}
