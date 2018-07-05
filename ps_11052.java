import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_11052 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] P = new int[N+1];
		String[] token = bf.readLine().split(" ");
		for (int i = 1; i <= N; i++) {
			P[i] = Integer.parseInt(token[i-1]);
		}
		int[] d = new int[N+1];
		// i 붕어빵 개수
		// j 팔거 
		for (int i = 1; i <= N; i++) {
			// max 
			for (int j = 1; j <= i; j++) {
				if (d[i] < P[j] + d[i-j])
					d[i] = P[j] + d[i-j];
			}
		}

		System.out.println(d[N]);
	}
}
