/* 
가장 증가하는 큰 수열 - 조건 따지면서 최대값 갱신 !! 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[1001];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		int[] d = new int[1001];
		for (int i = 1; i <= n; i++) {
			d[i] = 1;
			for (int j = 1; j < i; j++) {
				if (a[i] > a[j] && d[i] < d[j] + 1)
					d[i] = d[j] + 1;
			}
		}
		int max = 0; 
		for (int i = 1; i <= n; i++) {
			if (d[i] > max)
				max = d[i];
		}
		System.out.println(max);
	}
}
