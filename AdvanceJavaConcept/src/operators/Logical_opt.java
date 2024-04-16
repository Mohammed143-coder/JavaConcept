package operators;
//logical opt are And(&&),OR(||),XOR(^)
public class Logical_opt {

	public static void main(String[] args) {
	 int a=10 ,b=20 ,c=5;
	 System.out.println(a<b && b>c);
	 System.out.println(a<b && b<c);
	 System.out.println(a>b && b>c);
	 System.out.println(a>b && b<c);
	 System.out.println("-----------------");
	 System.out.println(a<b || b>c);
	 System.out.println(a<b || b<c);
	 System.out.println(a>b || b>c);
	 System.out.println(a>b || b<c);
	 System.out.println("-----------------");
	 System.out.println(a<b ^ b>c);
	 System.out.println(a<b ^ b<c);
	 System.out.println(a>b ^ b>c);
	 System.out.println(a>b ^ b<c);

	}

}
