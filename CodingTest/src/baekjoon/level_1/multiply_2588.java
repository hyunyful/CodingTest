package baekjoon.level_1;

import java.util.Scanner;

public class multiply_2588 {

	public static void main(String[] args) {
		
		/*
		세 자리 곱셈 과정을 나타내는 문제
		
								4 7 2			(1)
							X  3 8 5			(2)
							------------
		  					 2 3 6 0			(3)
						  3 7 7 6			(4)
					   1 4 1 6				(5)
 					-------------------
				       1 8 1 7 2 0			(6)
		
		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오. 
		*/
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int A = Integer.parseInt(scan.nextLine());			//472	
		String B = scan.nextLine();								//385
		
		//385를 각 자리수 따로 분리
		int[] nums = new int[3];
		
		int index = 0;
		for(int i=B.length()-1;i>=0;i--) {	
			nums[index++] = B.charAt(i)-'0';
		}

		
		for(int i=0;i<nums.length;i++) { 
			int num = A*nums[i];
			
			System.out.println(num); 
			
			num = (int) (num * Math.pow(10, i));
			
			sum = sum+num;
		}
		
		System.out.println(sum);

	}

}
