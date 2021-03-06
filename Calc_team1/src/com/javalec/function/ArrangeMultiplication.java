package com.javalec.function;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 팀 프로젝트 연습
*/

public class ArrangeMultiplication {
	
	// 범위의 시작 수와 끝나는 수를 받아서 범위의 곱셈을 구하기
	
	// Field
	int startNum;
	int endNum;
	int result = 1;
	
	// Constructor
	public ArrangeMultiplication() {
		// TODO Auto-generated constructor stub
	}

	public ArrangeMultiplication(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	
	// Method
	public void arrangeMultiplication() {
		arrangeSorting();
		for (int i = startNum; i <= endNum; i++ ) {
			result *= i;
		}
		System.out.printf("%d부터 %d까지의 숫자들의 곱은 %d입니다\n", startNum, endNum, result);
	}
	
	private void arrangeSorting() {
		if ( endNum < startNum) {
			int temp = endNum;
			endNum = startNum;
			startNum = temp;
		}
	}
	
}
