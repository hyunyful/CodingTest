package study_200913;

import java.util.Scanner;
import java.util.Stack;

public class WordReverse2_17413 {

	public static void main(String[] args) {
		
		/*
		문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
		첫째 줄에 문자열 S가 주어진다.
		S의 길이는 100,000 이하이다.
		
		먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
			1.알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
			2.문자열의 시작과 끝은 공백이 아니다.
			3.'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
			
		태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 
		단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 
		태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
		
		ex)
		1.baekjoon online judge -> noojkeab enilno egduj
		2.<open>tag<close> -> <open>gat<close>
		3.<ab cd>ef gh<ij kl> -> <ab cd>fe hg<ij kl>
		4.one1 two2 three3 4fourr 5five 6six -> 1eno 2owt 3eerht rruof4 evif5 xis6
		5.<int><max>2147483647<long long><max>9223372036854775807 
				-> <int><max>7463847412<long long><max>7085774586302733229
		6.<problem>17413<is hardest>problem ever<end>
				-> <problem>31471<is hardest>melborp reve<end>
		7.<   space   >space space space<    spa   c e>
				-> <   space   >ecaps ecaps ecaps<    spa   c e>
		*/
		
		Stack<Object> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		char[] abc = input.toCharArray();
		
		/*
		1. < 를 만나면 > 를 만날때까지 계속 출력
		2. > 이후부터는 <를 만날때까지 stack에 저장
		3. 스택에 저장하는 중 빈칸(띄어쓰기)를 만나면 스택을 비우기
		
		*/
		
		boolean flag = false;
		
		for(int i=0;i<abc.length;i++) {			
			if(abc[i] == '<') {
				flag = true;
			}
			
			if(flag) {
				printStack(stack);
				printWord(abc[i]);
			}else {
				putStack(stack,abc[i]);
			}
			
			if(abc[i] == '>') {
				flag = false;
			}
			
			if(i == abc.length-1 && !stack.empty()) {
				printStack(stack);
			}
		}
	}
	
	//스택에 데이터를 넣는 메소드
	public static void putStack(Stack stack, char a) {
		if(a == ' ') {
			printStack(stack);
			printWord(a);
		}else {
			stack.push(a);
		}
	}
	
	//스택을 비우는 메소드
	public static void printStack(Stack stack) {
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
	}
	
	//문자 출력하는 메소드
	public static void printWord(char a) {
		System.out.print(a);
	}
}
