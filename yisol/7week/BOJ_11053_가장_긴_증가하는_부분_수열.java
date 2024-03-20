import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		int[] dp=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			dp[i]=1;
		}
		int max=dp[0];
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j])
					dp[i]=Math.max(dp[i],dp[j]+1);
			}
			if(max<dp[i])
				max=dp[i];
		}
		System.out.println(max);
		
	}
	
}



