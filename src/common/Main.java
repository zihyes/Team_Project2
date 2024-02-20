package common;

import java.util.Scanner;

import B_branch.wind_display;

public class Main {
	public static void main(String[] args) {
		wind_display t = new wind_display();
		
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("에어컨 기능 선택 : ");
		System.out.println(" 1. 전원 on \n 2. 전원 off\n 3. 풍향 조절\n 4. 온도 조절");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			t.display();
			break;
		case 4:
			break;
		default:	
		}

	}

}
