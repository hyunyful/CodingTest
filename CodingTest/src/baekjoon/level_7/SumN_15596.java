package baekjoon.level_7;

public class SumN_15596 {

	public static void main(String[] args) {
		
		/*
		정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		작성해야 하는 함수는 다음과 같다.
		
		Java: long sum(int[] a); 
					a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
					리턴값: a에 포함되어 있는 정수 n개의 합
		*/
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		long r = sum(a);
		
		System.out.println(r);
		
	}
	
	static long sum(int[] a) {
		long ans = 0;
		
		for(int i=0;i<a.length;i++) {
			ans = ans+a[i];
		}
		
		return ans;
	}
}
