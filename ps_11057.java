/*
11057 오르막 수 

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long[][] D = new long[1001][11];
		long mod = 10007L;
		for (int i = 0; i <= 9; i++) {
			D[1][i] = 1;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++)
					D[i][j] += D[i-1][k];
				D[i][j] %= mod;
			}
		}
		long sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum += D[N][i];
			sum %= mod;
		}
		System.out.println(sum);
	}
}
