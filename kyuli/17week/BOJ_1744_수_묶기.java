package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_1744_수_묶기 {
	private static int N;
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> rpq = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a > 1) {
				pq.add(a);
			} else if (a == 1) {
				sum++;
			} else {
				rpq.add(a);
			}
		}
		
		while (pq.size() > 1) {
			num1 = pq.remove();
			num2 = pq.remove();
			sum += num1*num2;
		} 
		if(pq.size() == 1) {
			sum += pq.remove();
		}
		
		while(rpq.size() > 1) {
			num1 = rpq.remove();
			num2 = rpq.remove();
			sum += num1*num2;
		}
		if(rpq.size() == 1) {
			sum += rpq.remove();
		}
		
		System.out.println(sum);
		

	}

}
