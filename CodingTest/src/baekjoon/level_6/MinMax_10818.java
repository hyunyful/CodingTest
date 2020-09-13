package baekjoon.level_6;

import java.util.Scanner;

public class MinMax_10818 {

	public static void main(String[] args) throws Exception {

		/*
		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		
		ex)
		5
		20 10 35 30 7
		
		7 35
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		//arr[i]와 arr[i+1]를 비교
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min+" "+max);

	}

}
