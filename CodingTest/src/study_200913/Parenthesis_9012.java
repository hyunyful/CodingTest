package study_200913;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis_9012 {

	public static void main(String[] args) {

		/*
		괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
		그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
		한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 
		만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 
		그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
		예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 

		여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
		
		입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
		각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
		
		출력은 표준 출력을 사용한다. 
		만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
		
		ex1)
		6
		(())())
		(((()())()
		(()())((()))
		((()()(()))(((())))()
		()()()()(()()())()
		(()((())()(
		
		NO
		NO
		YES
		NO
		YES
		NO
		
		ex2)
		3
		((
		))
		())(()
		
		NO
		NO
		NO
		*/
		
		Scanner scan = new Scanner(System.in);
		
		/*
		(이 나오면 stack에 push
		)이 나왔을 때 스택이 비어있으면 NO 출력(break)
		)이 나왔을 때 스택이 비어있지 않으면 pop
		
		()를 다 돈 후 나왔을 때 스택이 비어있으면 YES, 비어있지 않으면 NO
		true면 YES
		*/
		
		final char openPS = '(';
		final char closePS = ')';
		
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<T;i++) {
			Stack<Character> stack = new Stack<>();
			String input = scan.nextLine();
			
			for(int j=0;j<input.length();j++) {
				char temp = input.charAt(j);
				
				//여는 괄호를 만나면
				if(temp == openPS) {
					stack.push(temp);
				}
				//닫는 괄호를 만나면
				else if(temp == closePS) {
					//스택에 ( 가 있으면 
					if(!stack.empty()) {
						stack.pop();
					}
					//스택에 ( 가 없으면
					else {
						System.out.println("NO");
						break;
					}
				}
				
				//j가 끝까지 돌았고(=break안만남) 
				if(j == input.length()-1) {
					//System.out.println(stack.empty());
					if(!stack.empty()) {
						System.out.println("NO");
					}else {
						System.out.println("YES");
					}
				}
				
			}
			
			
		}

	}
}
