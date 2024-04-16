package string_prog;

public class Daily_strings {

	//public static void main(String[] args) {
	//	String s1="hii";
	//	String s2=new String();
		//for(int i=0;i<s1.length();i++) {
		//	s2=s2+s1.charAt(i);	}
	//	System.out.println(s2);
	//	String a1= "1,2,3";
	//String a2=new String();
	//for(int i=a1.length()-1;i>=0;i--) {
	//	a2=a2+a1.charAt(i);}
	//System.out.println(a2);
		public static String helloName(String name) {
			  return "Hello"+" "+name+"!" ;
			  		 }
	
public static void main (String[]args) {
	String s1=helloName("bob");
	System.out.println(s1);
	System.out.println(helloName("Alice"));
	System.out.println(helloName("Student"));
	System.out.println(helloName("x"));
	}
}
