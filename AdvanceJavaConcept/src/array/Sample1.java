package array;

public class Sample1 {
	
public static int[] mergeS(int s[], int[] s1) {
		
		int len1 = s.length;
		int len2 = s1.length;
		int res[] = new int[len1 + len2];

		int i = 0, j = 0, k = 0;

		while (i < len1 && j < len2) {
			if (s[i] < s1[j]) {
				res[k++] = s[i++];
			} else {
				res[k++] = s1[j++];
			}

		}
		while (i < len1) {
			res[k++] = s[i++];
		}
		while (j < len2) {
			res[k++] = s1[j++];
		}
		return res;
	}

	public static void main(String[] args) {
		int a[] = {1,5,7,12};
		int b[] = {2,8,9};

		int[] c = mergeS(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
