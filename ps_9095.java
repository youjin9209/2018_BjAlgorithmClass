/*
9095 - 1,2,3 만들기
n 범위 정해졌으니까 위에서 d[] 다 만들어놓고 testcase 돌리기 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		int[] d = new int[11];
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		for (int i = 3; i <= 10; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		while(T-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			System.out.println(d[n]);
		}
	}

}
