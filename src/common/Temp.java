package common;

import java.util.Scanner;

public class Temp {
	Temp_DTO dto = new Temp_DTO();
	Scanner input = new Scanner(System.in);
	private int num;
	
	public void display() {
		boolean bool = true ;
		
		while (bool) {
			System.out.println("1. 현재 온도 확인");
			System.out.println("2. 온도 올리기");
			System.out.println("3. 온도 낮추기");
			System.out.println("4. 기능 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				saveTemp();
				
				break;
			case 2:
				upTemp();
				break;
			case 3:
				downTemp();
				break;
			case 4:
				bool = false;
				break;
			default:
				break;
			}
		}
	}
	public void settingTemp() {
		dto.setTemp((int)(Math.random() * 10) + 16);
	}
	private void saveTemp() { //1번) 현재 온도 확인
		System.out.println("현재온도 : " + dto.getTemp());
	}
	private void upTemp() {
		dto.setTemp(dto.getTemp() + 1);
		System.out.println("현재온도 : " + dto.getTemp());
	}
	private void downTemp() {
		dto.setTemp(dto.getTemp() - 1);
		System.out.println("현재온도 : " + dto.getTemp());
	}
	

}
