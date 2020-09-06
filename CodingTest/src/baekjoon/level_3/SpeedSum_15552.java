package baekjoon.level_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SpeedSum_15552 {

	public static void main(String[] args) throws Exception {
		
		/*
		본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
		입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
		
		Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
		BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		
		첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
		다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		
		ex)
		5				(T)
		1 1
		12 34
		5 500
		40 60
		1000 1000
		
		2
		46
		505
		100
		2000
		*/
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(scan.readLine());
		
		for(int i=0;i<T;i++) {
			String input = scan.readLine();
			
			int A = Integer.parseInt(input.split(" ")[0]);
			int B = Integer.parseInt(input.split(" ")[1]);
			
			writer.write(String.valueOf(A+B+"\n"));
		}

		writer.flush();
		
		scan.close();
		writer.close();
	}

}
