package B_branch;

import java.util.Scanner;

public class wind_display {
	wind_dto t = new wind_dto();
	public void display() {
		Scanner input = new Scanner(System.in);
		int low, medium, high, back, num;
		boolean bool = true;
		while(bool) {
			System.out.println("1. low");
			System.out.println("2. medium");
			System.out.println("3. high");
			System.out.println("4. back");
			System.out.print(">>>>");
			num = input.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("low");
					break;
				case 2:
					System.out.println("medium");
					break;
				case 3:
					System.out.println("high");
					break;
				case 4:
					bool = false;
					break;
					
				default:
					System.out.println("inbalid input value");
				}
			

		}
	}


}
