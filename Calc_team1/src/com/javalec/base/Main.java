package com.javalec.base;

import java.util.Scanner;


import com.javalec.function.ChoiceMenu;
import com.javalec.function.PrintMenu;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 팀 프로젝트 연습
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		int startNum = 0;
		int endNum = 0;
		int choice = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		// 입력값 받기
		PrintMenu printMenu = new PrintMenu();
		while (flag) {
			printMenu.printMenu();
			choice = scanner.nextInt();
			if (choice > 6 || choice < 1) {
				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
			} else if (choice >= 1 && choice < 6) {
				System.out.print("첫번쨰 수를 입력하세요 : ");
				startNum = scanner.nextInt();
				System.out.print("두번쨰 수를 입력하세요 : ");
				endNum = scanner.nextInt();
				ChoiceMenu choiceMenu = new ChoiceMenu(choice, startNum, endNum);
				choiceMenu.menuChoice();
				System.out.println("-------------------------");
			} else {
				flag = false;
				System.out.println("종료합니다.");
			}
			
		}
		scanner.close();
		
		
		// 화면 출력


	}

}
