package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931_회의실_배정 {
	private static int N;
	private static BufferedReader br;
	private static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
			arr[i][1] = Integer.parseInt(st.nextToken()); // 끝나는 시간
		}
		// 끝나는 시간을 기준으로 정렬하기 위해 Comparator 인터페이스의 compare 재정의
		Arrays.sort(arr, new Comparator<int[]>() { 
			@Override
			public int compare(int[]o1, int[]o2) {
				// 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬해야한다.
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1]; // 끝나는 시간이 빠른 것부터 정렬
				
			}
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i=0; i<N; i++) {
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
			if(prev_end_time <= arr[i][0]) {
				prev_end_time = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
