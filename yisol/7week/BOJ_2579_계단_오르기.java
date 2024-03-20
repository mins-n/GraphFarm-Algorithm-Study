import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] stairs=new int[N+1];
		int[] dp=new int[N+1];
		for(int i=1;i<=N;i++) {
			stairs[i]=sc.nextInt();
		}
		stairs[0]=dp[0]=0;
		dp[1]=stairs[1];
		if(N>1) {
			dp[2]=stairs[1]+stairs[2];
		}
		for(int i=3;i<=N;i++) {
			dp[i]=Math.max(dp[i-2],stairs[i-1]+dp[i-3])+stairs[i];
		}
		System.out.println(dp[N]);
	}

	}

