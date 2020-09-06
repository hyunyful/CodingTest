package study;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10828 {

	public static void main(String[] args) {
		/*
		정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

		명령은 총 다섯 가지이다.
		1.push X: 정수 X를 스택에 넣는 연산이다.
		2.pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		3.size: 스택에 들어있는 정수의 개수를 출력한다.
		4.empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		5.top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		*/
		
		Stack<Integer> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine());		
		
		for(int i=0;i<N;i++) {
			String input = scan.nextLine();
			
			if(input.contains("push")) {
				
				//숫자만 추출
				int num = Integer.parseInt(input.split(" ")[1]);
				
				stack.push(num);
				
			}else {
				switch(input) {				
				case "pop":
					if(!stack.empty()) {	
						int peek = stack.pop();
						
						System.out.println(peek);
						
					}else {		
						System.out.println(-1);
					}
					break;
					
				case "size":
					System.out.println(stack.size());
					break;
					
				case "empty":
					if(stack.empty()) {		
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
					
				case "top":
					if(!stack.empty()) {
						int peek = stack.peek();
						
						System.out.println(peek);
					}else {
						System.out.println(-1);
					}
					break;
					
				}
			}
		}
	}

}
