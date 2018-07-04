/*
1로 만들기 - 1463
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] d = new int[N+1];
		d[1] = 0;
		for(int i = 2; i <= N; i++) {
			// 3. 1 뺀다 
			d[i] = d[i-1] + 1;
			// 2. 2로 나누어 떨어 && 최소값 갱신 
			if (i%2 == 0 && d[i] > d[i/2] + 1)
				d[i] = d[i/2] + 1;
			// 1. 3로 나누어 떨어 && 최소값 갱신 
			if (i%3 == 0 && d[i] > d[i/3] + 1)
				d[i] = d[i/3] + 1;
		}
		System.out.println(d[N]);
	}
}
