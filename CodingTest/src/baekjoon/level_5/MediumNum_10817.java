package baekjoon.level_5;

import java.util.Scanner;

public class MediumNum_10817 {

	public static void main(String[] args) {

		/*
		세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		
		ex)
		20 30 10		->			20
		30 30 10		->			30
		40 40 40		->			40
		20 10 10		->			10
		*/

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		int[] nums = new int[3];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = Integer.parseInt(input.split(" ")[i]);
		}
		
		if(nums[0] >= nums[1] && nums[0] >= nums[2]) {			//0이 최고숫자
			if(nums[1] >= nums[2]) {
				System.out.println(nums[1]);
			}else {			// nums[2] > nums[1]
				System.out.println(nums[2]);
			}
		}else if(nums[1] >= nums[2] && nums[1] >= nums[0]){			//1이 최고 숫자
			if(nums[0] >= nums[2]) {
				System.out.println(nums[0]);
			}else {			// nums[2] > nums[0]
				System.out.println(nums[2]);
			}
		}else if(nums[2] >= nums[0] && nums[2] >= nums[1]) {		//2가 최고 숫자
			if(nums[1] >= nums[0]) {
				System.out.println(nums[1]);
			}else {			// nums[0] > nums[1]
				System.out.println(nums[0]);
			}
		}else {
			System.out.println("모르겟싸여");
		}
	}

}
