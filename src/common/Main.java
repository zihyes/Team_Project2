package common;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("에어컨 기능 선택 : ");
		System.out.println(" 1. 전원 on \n 2. 전원 off\n 3. 풍향 조절\n 4. 온도 조절");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("현재 온도 확인");
			break;
		case 2:
			System.out.println("온도 올리기");
			break;
		case 3:
			System.out.println("온도 낮추기");
			break;
		case 4:
			System.out.println("기능 종료");
			break;
		default:	
		}

	}

}
