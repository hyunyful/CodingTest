package study_200920;

import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {

		/*
		M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) 
		M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
		
		ex)
		3 16
		
		3
		5
		7
		11
		13
		*/

		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		scan.nextLine();
		
		/*
		//M부터 N까지
		for(int i=M;i<=N;i++) {
			int temp = i;
			
			for(int j=1;j<=temp;j++) {
				
				if(temp % j == 0) {
					if(j == temp) {
						System.out.println(temp);
					}else if(j != 1){
						break;
					}
				}
				
			}
		}
		*/
		
		int[] arr = new int[N+1];
		arr[1] = 1;
		//0이 소수
		
		//2,3,4..의 배수들을 1로 바꾸기 (소수 아님)
		for(int i=2;i<=N;i++) {
			for(int j=2;i*j<=N;j++) {
				arr[i*j] = 1;
			}
		}
		
		//1로 안바뀐 숫자들만 출력
		for(int i=M;i<arr.length;i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
