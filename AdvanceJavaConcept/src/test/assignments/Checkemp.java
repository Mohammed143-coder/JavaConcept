package test.assignments;

public class Checkemp {
public static void chexp(double exp,Empl s) {
	if(exp>=5) {
		double salar= s.getSal();
		System.out.println("The sal is hiked by 70per"+" "+salar*1.75+" k");
	}
	else if(exp>=2) {
		double salar= s.getSal();
		System.out.println("The sal is hiked by 50per"+" "+salar*1.50+" K");
	}
	else  {
		System.out.println("no hike because of freshers");
	}
}
}
