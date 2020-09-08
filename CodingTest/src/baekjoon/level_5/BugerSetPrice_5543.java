package baekjoon.level_5;

import java.util.Scanner;

public class BugerSetPrice_5543 {

	public static void main(String[] args) {

		/*
		상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 
		주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
		햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
		햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
		
		입력은 총 다섯 줄이다. 
		첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 
		넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
		
		ex1)
		800
		700
		900
		198
		330
		
		848
		
		ex2)
		1999
		1999
		100
		189
		100
		
		150
		*/

		Scanner scan = new Scanner(System.in);
		
		//1.위에 3개 숫자(버거 가격)을 입력받으면서 가장 작은 값을 저장
		//2.밑 음료 가격 2개를 입력받으면서 가장 작은 값을 저장
		//3.1,2번에서 저장한 가격을 +한 뒤 -50
		
		int burger = 3000;				//버거 가격
		int coke = 3000;					//음료 가격
		
		for(int i=0;i<3;i++) {
			int temp = Integer.parseInt(scan.nextLine());
			
			if(temp < burger) {			//burger값이 지금 받은 값보다 큰 경우
				burger = temp;
			}
		}
		
		for(int i=0;i<2;i++) {
			int temp = Integer.parseInt(scan.nextLine());
			
			if(temp < coke) {				//coke값이 지금 받은 값보다 큰 경우
				coke = temp;
			}
		}
		
		System.out.println((burger+coke-50));
		
	}

}
