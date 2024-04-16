 package threads;

	public class Fuctional_Interface {

		public static void main(String[] args) {
			Runnable r1 = () -> {
				for (int i = 1; i <= 5; i++) {
					System.out.println("run:" + i);
				}
			};
			r1.run();
			System.out.println("---------------");
			Runnable r2 = () -> {
				for (int i = 2; i <= 5; i++) {
					System.out.println("run:" + i);
				}
			};
			r2.run();
			System.out.println("---------------");
				for (int i = 1; i <= 10; i++) {
					System.out.println("main:" + i);}
				}
	}
