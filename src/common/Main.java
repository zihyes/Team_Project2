package common;

import java.util.Scanner;

import B_branch.wind_display;

public class Main {
	public static void main(String[] args) {
		Temp t = new Temp();
		wind_display a = new wind_display();
		
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		boolean bool = true;
		
		t.settingTemp(); //기본 온도 설정
		
		while (bool) {
			System.out.println("에어컨 기능 선택 : ");
			System.out.println(" 1. 전원 on \n 2. 전원 off\n 3. 풍향 조절\n 4. 온도 조절");
			num = input.nextInt();
			
			switch(num) {
			case 1://켜기
				t.display();
				break;
			case 2://끄기
				bool = false;
				break;
			case 3:
				a.display();
				break;
			case 4:
				t.display();
				break;
			default:	
			}
		

		}
		}
}
