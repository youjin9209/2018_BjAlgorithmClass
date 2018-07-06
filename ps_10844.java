/*
10844 쉬운계단수 
마지막수가 0, 9 일경우 예외상황 ㅇㅋ -> 예외상황 나니까 변수 잡아준다 
D[N] 이 아니라  D[N][L] 로
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long[][] D = new long[101][11];
		long mod = 1000000000L;
		for(int i = 1; i <= 9; i++) {
			D[1][i] = 1;
		}
		for(int i = 1; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j-1 >= 0)
					D[i][j] += D[i-1][j-1];
				if (j+1 <= 9)
					D[i][j] += D[i-1][j+1];
				D[i][j] %= mod;
			}
		}
		long sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += D[N][i];
			sum %= mod;
		}
		System.out.println(sum);
	}
}
