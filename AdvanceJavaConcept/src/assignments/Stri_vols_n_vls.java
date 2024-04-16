package assignments;

public class Stri_vols_n_vls {
	public static void test(String a) {
	int count=0;
	for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
					a.charAt(i)=='o'||a.charAt(i)=='u') {
				count++; 
			} 
	}
	System.out.println(count); 
}

public static void test1(String a) {
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!='a'&&a.charAt(i)!='e'&& a.charAt(i)!='i'&& 
				a.charAt(i)!='o'&& a.charAt(i)!='u') {
			count++; } }
	System.out.println(count);
	}
	public static void main(String[] args) {
		String a="itsagreatday";
		test(a);

	}

}
