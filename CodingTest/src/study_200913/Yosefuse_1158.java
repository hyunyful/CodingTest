package study_200913;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Yosefuse_1158 {

	public static void main(String[] args) {

		/*
		 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한
		 * 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서
		 * 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1,
		 * 4>이다. N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
		 * 
		 * ex1) 7 3
		 * 
		 * <3, 6, 2, 7, 5, 1, 4>
		 */

		Scanner scan = new Scanner(System.in);
		
		Queue<Integer> nums = new LinkedList<Integer>();
		Queue<Integer> result = new LinkedList<Integer>();
		
		String input = scan.nextLine();
		
		int N = Integer.parseInt(input.split(" ")[0]);
		int K = Integer.parseInt(input.split(" ")[1]);
		
		int cnt = 1;
		
		for (int i = 1; i <= N; i++) {
			nums.offer(i);
		}
		
		while (!nums.isEmpty()) {
			
			if (cnt % K == 0) {
				result.offer(nums.poll());
			}
			if (cnt % K != 0) {
				
				nums.offer(nums.poll()); 
			}
			cnt++;
		}
		
		System.out.print("<" + result.poll());
		while (!result.isEmpty()) {
			System.out.print(", " + result.poll());
		}
		System.out.print(">");

	}

}
