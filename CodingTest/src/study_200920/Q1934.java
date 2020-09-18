package study_200920;

import java.util.Scanner;

public class Q1934 {

	public static void main(String[] args) {
		
		/*
		두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 
		이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
		예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
		두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
		
		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
		둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
		
		ex)
		3
		1 45000
		6 10
		13 17
		
		45000
		30
		221
		*/

		/*
		A,B를 입력받아서 더 작은 수에 1부터 n까지 곱하기
		곱한 수/B를 했을 때 나머지가 0이면 해당 수가 공배수
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<T;i++) {
			int target = 0;
			int n = 1;
			int rest = 0;
			
			String input = scan.nextLine();
			
			int A = Integer.parseInt(input.split(" ")[0]);
			int B = Integer.parseInt(input.split(" ")[1]);
			
			if(A == B) {
				//System.out.println("A와 B가 같습니다");
				target = A;
			}else if(A>B) {
				//System.out.println("A가 B보다 큽니다");
				do {
					target = B*n;
					//System.out.println("B는"+B+" n은 "+n+" B*n은 "+target);
					rest = target%A;
					//System.out.println("나머지는 "+rest);
					n++;
				}while(rest != 0);
			}else if(A<B) {
				//System.out.println("A가 B보다 큽니다");
				do {
					target = A*n;
					//System.out.println("A는"+A+" n은 "+n+" A*n은 "+target);
					rest = target%B;
					//System.out.println("나머지는 "+rest);
					n++;
				}while(rest != 0);
			}
			
			System.out.println(target);
			
		}
		
	}

}
