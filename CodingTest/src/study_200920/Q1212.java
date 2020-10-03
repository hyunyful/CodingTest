package study_200920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1212 {

	public static void main(String[] args) throws Exception {
		
		/*
		8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
		첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
		첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
		
		 ex)
		 314
		 
		 11001100
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String eNum = br.readLine();
		
		for(int i=0;i<eNum.length();i++) {
			char temp = eNum.charAt(i);
			
			if(i == 0) {
				switch(temp) {
					case '1':
						bw.append("1");
						break;
						
					case '2':
						bw.append("10");
						break;
						
					case '3':
						bw.append("11");
						break;
						
					case '4':
						bw.append("100");
						break;
						
					case '5':
						bw.append("101");
						break;
						
					case '6':
						bw.append("110");
						break;
						
					case '7':
						bw.append("111");
						break;
						
				}
			}else {
				switch(temp) {
					case '0':
						bw.append("000");
						break;
					
					case '1':
						bw.append("001");
						break;
					
					case '2':
						bw.append("010");
						break;
					
					case '3':
						bw.append("011");
						break;
					
					case '4':
						bw.append("100");
						break;
					
					case '5':
						bw.append("101");
						break;
					
					case '6':
						bw.append("110");
						break;
					
					case '7':
						bw.append("111");
						break;
				}
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();

	}

}
