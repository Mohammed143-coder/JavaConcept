package flowcontrol_stmt;

public class Pattern_prog {
	public static void check(int n) {
		for (int i= 1; i< n; i++) {
			for (int j= n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k= 1; k<= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i= 1; i<= n; i++) {
			for (int j =1;j<= i; j++) {
				System.out.print(" ");
			}
		 	for (int k= n;k>= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		check(3);
	}
}  
