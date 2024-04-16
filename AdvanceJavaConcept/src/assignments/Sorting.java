package assignments;


public class Sorting {
	public static void test(int[] n) {
		int jan;
		for (int i=0;i<n.length;i++) {
			for(int j=i;j<n.length;j++) {
				if(n[i]>n[j]) {
					jan=n[i];
					n[i]=n[j];
					n[j]=jan;}
			}
			System.out.println(n[i]);
		}
	}

	public static void main(String[] args) {
		int[]n= {70,50,60,20,10,5};
		test(n);

	}

}
