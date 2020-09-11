package study_200913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 
public class StackSeq_1874 {
    
    public static void main(String[] args) throws IOException{
    	
    	/*
    	1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
    	이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
    	임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 
    	있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 
    	이를 계산하는 프로그램을 작성하라.
    	
    	첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 
    	둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 
    	물론 같은 정수가 두 번 나오는 일은 없다.
    	
    	입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. 
    	push연산은 +로, pop 연산은 -로 표현하도록 한다. 
    	불가능한 경우 NO를 출력한다.
    	
    	ex1)
    	8
		4
		3
		6
		8
		7
		5
		2
		1
		
		+
		+
		+
		+
		-
		-
		+
		+
		-
		+
		+
		-		
		-
		-
		-
		-
		
		ex2)
		5
		1
		2
		5
		3
		4
		
		NO
    	*/
    	
    	/*
    	만들어야 하는 수열을 target[]에 저장
    	num이 target[i]보다 작으면 num을 증가시키면서 스택에 푸시 (target[i]와 같아질 떄까지) +
    	num이 target[i]가 같거나 크면 스택에 target[i]가 있는지 확인한 후 있으면 target[i]가 나올때까지 pop -
    	스택에  target[i]가 없으면 NO
    	*/
    	
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        List result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(scan.readLine());
        
        int[] target = new int[n];
        
        for(int i=0;i<n;i++) {
        	target[i] = Integer.parseInt(scan.readLine());
        }
        
        int num = 0;				//stack에 들어갈 1부터 n까지 증가될 수	
        
        for(int i=0;i<n;i++) {
        	//num이 target[i]보다 작으면
        	if(num < target[i]) {
        		while(num < target[i]) {
        			stack.push(++num);
        			result.add("+");
        		}
        	}
        	
        	//num이 target[i]보다 크거나 같으면
        	if(num >= target[i]) {
        		//스택에 target[i]가 존재하는지 확인
        		if(stack.contains(target[i])) {
        			//존재하면 target[i]가 지워질 때까지 계속 pop
        			while(true) {
        				int peek = stack.peek();
        				stack.pop();
            			result.add("-");
            			if(peek == target[i]) break;
        			}
        		}
        		//스택에 target[i]가 없으면
        		else {
        			System.out.println("NO");
        			result.removeAll(result);
        			break;
        		}
        	}
        	
        }
        
        for(int i=0;i<result.size();i++) {
        	System.out.println(result.get(i));
        }
        
    }
}