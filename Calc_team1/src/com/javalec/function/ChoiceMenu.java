package com.javalec.function;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 팀 프로젝트 연습
*/
public class ChoiceMenu {
	
	// Field
	int choice;
	int startNum;
	int endNum;
	
	GuGuDan guGuDan = new GuGuDan();
	RangeSum rangeSum = new RangeSum();
	AddSubtract addSubtract = new AddSubtract();
	
	// Constructor
	public ChoiceMenu() {
		// TODO Auto-generated constructor stub
	}

	public ChoiceMenu(int choice, int startNum, int endNum) {
		super();
		this.choice = choice;
		this.startNum = startNum;
		this.endNum = endNum;
		
	}
	
	
	// Method
	public void menuChoice() {
		if (choice ==1 ) {
			addSubtract.num1 = startNum;
			addSubtract.num2 = endNum;
			addSubtract.addition();
			addSubtract.subtraction();
		} else if (choice == 2) {
			
		} else if (choice == 3) {
			System.out.printf("%d 와 %d 사이의 합계는 %d입니다.\n", startNum, endNum, rangeSum.rangeSum(startNum, endNum));
		} else if (choice == 4) {
			ArrangeMultiplication arrangeMultiplication = new ArrangeMultiplication(startNum, endNum);
			arrangeMultiplication.arrangeMultiplication();
		} else if (choice == 5) {
			guGuDan.guguPrint(startNum, endNum);
		}
	}
	
	
}
