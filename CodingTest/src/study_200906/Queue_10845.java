package study_200906;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_10845 {

	public static void main(String[] args) {
		
		/*
		정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		
		1.push X: 정수 X를 큐에 넣는 연산이다.
		2.pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		3.size: 큐에 들어있는 정수의 개수를 출력한다.
		4.empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		5.front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		6.back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		*/
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		int num = -1;
		
		for(int i=0;i<N;i++) {
			String input = scan.nextLine();
			
			switch(input) {
				case "pop":		
					System.out.println(queue.isEmpty()?-1:queue.remove());
					break;
						
				case "size":
					System.out.println(queue.size());
					break;
						
				case "empty":
					System.out.println(queue.isEmpty()?1:0);
					break;
						
				case "front":
					System.out.println(queue.isEmpty()?-1:queue.element());
					break;
						
				case "back":
					System.out.println(num);
					break;
					
				default:
					num = Integer.parseInt(input.split(" ")[1]);
					queue.add(num);	
			}
		}
	}

}

