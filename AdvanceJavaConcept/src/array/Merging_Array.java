package array;

public class Merging_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i <a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j <b.length; j++) {
			c[a.length+j] = b[j];
		}
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}
	}


