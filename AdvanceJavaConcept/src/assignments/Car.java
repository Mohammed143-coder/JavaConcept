package assignments;

import java.util.Scanner;

	class Car implements Vehicle{
		Scanner sc=new Scanner(System.in);
		@Override
		public void start() {
			boolean key;
			String fuel;
			System.out.println("Enter true if you want to insert key to start car");
			key=sc.nextBoolean();
			System.out.println("Enter fuel type diesel or petrol");
			fuel=sc.next();
			if(key==true && fuel.equalsIgnoreCase("diesel"))
				System.out.println("Car started");
			else {
				System.out.println("Car cannot be started");
				start();
			}
		}
		@Override
		public void stop() {
			int speed;
			System.out.println("Do you want to stop the car? Reduce speed to 5 km/hr");
			speed=sc.nextInt();
			if(speed==5)
				System.out.println("Car stopped");
			else {
				System.out.println("Please reduce the speed to 5 km/hr to stop");
				stop();
			}
		}
		
	}
	class Bike implements Vehicle{
		Scanner sc=new Scanner(System.in);
		@Override
		public void start() {
			boolean kick;
			System.out.println("Enter true to start bike by kick");
			kick=sc.nextBoolean();
			if(kick==true)
				System.out.println("Bike started");
			else {
				System.out.println("Please kick to start the bike");
				start();
			}
		}
		@Override
		public void stop() {
			Scanner sc=new Scanner(System.in);
			int speed;
			System.out.println("Enter speed..");
			speed=sc.nextInt();
			int time;
			System.out.println("Enter tot requried hours...");
			time=sc.nextInt();
			System.out.println("The tot distance of bike stop at after 24hrs is "+speed*time+"km");
		}
	}