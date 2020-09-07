package baekjoon.level_4;

import java.util.Scanner;

public class SumCycle_1110 {

	public static void main(String[] args) {

		/*
		보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		예를 들어 26은 2+6=8이다.
		더한 값인 8과 오른쪽 숫자인 6을 이어붙이면 68이다.
		6+8=14 -> 84
		8+4=12 -> 42
		4+2=6 -> 26
		26이 26으로 돌아오는데 걸린 사이클은 4
		따라서 4를 출ㄺ하면 된다.
		
		ex)
		26 -> 4
		55 -> 3
		1 -> 60
		*/
		
		Scanner scan = new Scanner(System.in);
	
		int N = Integer.parseInt(scan.nextLine());
		
		int cycle = 0;
		int copyN = N;
		
		System.out.println("----");
		do {
			//N의 1의자리를 10의 자리에 두고
			//각 두 자릿수를 더한 값의 %10 의 값을 1의 자리에
			N = ( ( N%10 )*10 ) + (( (N/10) + (N%10) )%10 );
			
			System.out.println(N);
			cycle++;
		}while (copyN != N);
		System.out.println("----");
		System.out.println(cycle);

	}

}
