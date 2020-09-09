package study_200906;

import java.util.Scanner;
import java.util.Stack;

public class WordReverse_9093 {

	public static void main(String[] args) {
		
		/*
		문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
		단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
		
		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
		각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
		단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 
		단어와 단어 사이에는 공백이 하나 있다.
		
		ex)
		2
		I am happy today
		We want to win the first prize
		
		I ma yppah yadot
		eW tnaw ot niw eht tsrif ezirp
		*/
		
		Stack stack = new Stack();
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<T;i++) {
			String input = scan.nextLine();
			
			char[] abc = input.toCharArray();
			
			for(int j=0;j<abc.length;j++) {
				
				if(abc[j] == ' ') {
					while(!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(abc[j]);
				}else {		
					stack.push(abc[j]);
				}
				
				if(j == abc.length-1 && !stack.empty()) {
					while(!stack.empty()) {
						System.out.print(stack.pop());
					}
				}
				
			}
			
			System.out.println();
		}
		
	}
}